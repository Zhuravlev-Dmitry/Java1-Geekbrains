package HomeWork6ZhuravlevD;

public class HomeWork6ZhuravlevD {
        public static void main(String[] args) {
            Dog dog = new Dog("Собака",500,10);
            Cat cat = new Cat("Кот", 200,0);
            float runLength = 100;
            float swimLength = 11;
            String WinResult = " Ура!! Получилось!!";
            String LossResult = " увы не вышло(";
            String eventName;
            String eventResult;
            Animals[] animal = {cat, dog};

            for (int i = 0; i < animal.length; i++) {
                String nameString = animal[i].getName() + " может ";

                eventName = "пробежать на " + animal[i].getMaxDistRun() + " м. Необходимо пробежать на ";
                eventResult = animal[i].run(runLength) ? WinResult : LossResult;
                result(nameString, eventName, runLength, eventResult);

                int swimResult = animal[i].swim(swimLength);
                eventName = "проплыть на " + animal[i].getMaxDistSwim() + " м. Пытается проплыть на ";
                eventResult = (swimResult == Animals.swimAvailable) ? WinResult : LossResult;

                if (swimResult == Animals.notSwim)
                    eventResult = " он утонул, т.к. не умеет плавать...";
                result(nameString, eventName, swimLength, eventResult);
            }
        }

    private static void result(String nameAnimal, String event, float eventLength, String resultEvent) {
        System.out.println(nameAnimal + event + eventLength + " м. и" + resultEvent);

        }


}

