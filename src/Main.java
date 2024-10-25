// Базовий клас Persona
class Persona {
    protected String name;
    protected int age;

    public Persona(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void show() {
        System.out.println("Ім'я: " + name);
        System.out.println("Вік: " + age);
    }
}

// Похідний клас Student
class Student extends Persona {
    private String major;

    public Student(String name, int age, String major) {
        super(name, age);
        this.major = major;
    }

    @Override
    public void show() {
        super.show();
        System.out.println("Спеціальність: " + major);
    }
}

// Похідний клас Teacher
class Teacher extends Persona {
    private String subject;

    public Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    @Override
    public void show() {
        super.show();
        System.out.println("Предмет: " + subject);
    }
}

// Похідний клас HeadOfDepartment (Завідувач кафедри)
class HeadOfDepartment extends Teacher {
    private String department;

    public HeadOfDepartment(String name, int age, String subject, String department) {
        super(name, age, subject);
        this.department = department;
    }

    @Override
    public void show() {
        super.show();
        System.out.println("Кафедра: " + department);
    }
}

public class Main {
    public static void main(String[] args) {
        // Створення масиву об'єктів типу Persona
        Persona[] people = new Persona[3];
        
        // Заповнення масиву різними типами об'єктів
        people[0] = new Student("Олена", 20, "Інформатика");
        people[1] = new Teacher("Іван", 45, "Математика");
        people[2] = new HeadOfDepartment("Петро", 50, "Фізика", "Фізичний факультет");

        // Виведення інформації про всіх осіб
        for (Persona person : people) {
            person.show();
            System.out.println("-----------------");
        }
    }
}
