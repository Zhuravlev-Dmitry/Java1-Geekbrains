public class HomeWork2ZhuravlevD {
    public static void main(String[] args) {
        System.out.println("1.Задание.");
        System.out.println(SumWithin10and20(10, 6));
        System.out.println("2.Задание.");
        PosOrNeg(-1);
        System.out.println("3.Задание.");
        System.out.println(MyBoolean(0));
        System.out.println("4.Задание.");
        printWordNTimes("Hello", 4);
        System.out.println("5.Задание.");
        System.out.println(TypeOfYear(2020));

    }

    //1.Написать метод, принимающий на вход два целых числа и проверяющий, что их сумма лежит в пределах от 10 до 20
    // (включительно), если да – вернуть true, в противном случае – false
    public static boolean SumWithin10and20(int x1, int x2) {
        boolean SumWithin10and20 = ((x1 + x2) >= 10 && (x1 + x2) <= 20);
        return SumWithin10and20;
    }

    //2.Написать метод, которому в качестве параметра передается целое число,
    //метод должен напечатать в консоль, положительное ли число передали или отрицательное.
    //Замечание: ноль считаем положительным числом.
    public static void PosOrNeg(int x) {
        if (x >= 0) {
            System.out.println("Positive");
        } else {
            System.out.println("Negative");
        }
    }

    //3.Написать метод, которому в качестве параметра передается целое число.
    //Метод должен вернуть true, если число отрицательное, и вернуть false если положительное.
    public static boolean MyBoolean(int x) {
        if (x >= 0) {
            return true;
        }
        return false;
    }

    //4.Написать метод, которому в качестве аргументов передается строка и число,
    //метод должен отпечатать в консоль указанную строку, указанное количество раз.
    public static void printWordNTimes(String word, int times) {
        for (int i = 0; i < times; ++i) {
            System.out.println(i + " " + word);
        }
    }

    //5.Написать метод, который определяет, является ли год високосным,
    //и возвращает boolean (високосный - true, не високосный - false).
    //Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.
    public static boolean TypeOfYear (int year) {
        if (year % 4 == 0 && year % 400 != 0) {
            return true;
        } else if (year % 100 != 0) {
            return false;
        } else {
            return false;
        }
    }


}


