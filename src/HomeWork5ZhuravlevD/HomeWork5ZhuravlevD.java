package HomeWork5ZhuravlevD;

public class HomeWork5ZhuravlevD {
    public static void main(String[] args) {

        Employee mainEmployee = new Employee("Василий", "Иванович",
                "Васильков", "8(999)345-76-79",
                "Vasily@mail.ru", "Director-owner", 2000000, 1976);
        //4. Создать массив из 5 сотрудников.
        Employee[] Crew = {
                mainEmployee,
                new Employee("Дмитрий","Михайлович","Журавлев","8(923)456-34-78",
                        "Dmitry@list.ru","Master",45000,1989),
                new Employee("Валерий","Павлович","Агафонов","8(945)454-67-23",
                        "Valera@mail.ru","ChefMate",40000,1978),
                new Employee("Виктор","Иванович","Репин","8(800)100-67-67",
                        "Vitya-vitaliy@mail.ru","Boatswain",27000,1969),
                new Employee("Антон","Витальевич","Зарубин","8(949)467-94-73",
                        "Zarubin@mail.ru","Seamen",25000,1990),
                new Employee("Анна","Николаевна","Антипова","8(900)495-88-88",
                        "Antipova@mail.ru","Cook",20000,1992)
        };
        getAllEmployeeInCrew(Crew);
        System.out.println("Сотрудники старше 40 лет: ");
        getOldEmployee(Crew, 40);
    }
    private static void getOldEmployee(Employee[] crew, int year) {
        for (int i = 0; i < crew.length; i++)
            if (crew[i].getAge() > year) {
                System.out.println(crew[i].getAllInfo());
            }
    }

    private static void getAllEmployeeInCrew(Employee[] crew) {
        System.out.println("Список всех сотрудников: ");
        for (int i = 0; i < crew.length; i++)
            System.out.println((i + 1) + " " + crew[i].getAllInfo());
    }
}
