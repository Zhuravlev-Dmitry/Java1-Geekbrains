package HomeWork5ZhuravlevD;
//1.Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст.
public class Employee {
    private String surname;
    private String name;
    private String secondName;
    private String position;
    private String email;
    private String phone;
    private int salary;
    private int yearOfBerth;
    private static int Year = 2021;

// 2.Конструктор класса должен заполнять эти поля при создании объекта;
            public Employee(String name,
                        String secondName,
                        String surname,
                        String phone,
                        String email,
                        String position,
                        int salary,
                        int yearOfBerth) {
            this.yearOfBerth = yearOfBerth;
            this.name = name;
            this.secondName = secondName;
            this.surname = surname;
            this.email = email;
            this.position = position;
            this.phone = phone;
            this.salary = salary;
        }

// 3.	Внутри класса «Сотрудник» написать методы, которые возвращают значение каждого поля;


        String getName() {
        return name;
        }
        String getSecondName() {
            return secondName;
        }

        String getSurname() {
            return surname;
        }
        String getEmail() {
        return email;
        }
        String getPosition() {
            return position;
        }
        String getPhone() {
            return phone;
        }
        int getAge() {
                return Year - yearOfBerth;
        }
        int getSalary() {
            return salary;
            }
        String getAllInfo() {
            return this.name + " " +
                    this.secondName + " " +
                    this.surname + ", " +
                    this.getAge() + " years old, " +
                    this.position + ". Phone number: " +
                    this.phone + ". Salary is " +
                    this.getSalary() + " RU";
        }

    }
