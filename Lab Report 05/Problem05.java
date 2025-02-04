class Person {
    String name;
    int age;
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Person Constructor Called.");
    }
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Employee extends Person {
    String jobTitle;

    public Employee(String name, int age, String jobTitle) {
        super(name, age);
        this.jobTitle = jobTitle;
        System.out.println("Employee Constructor Called.");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Job Title: " + jobTitle);
    }
}

public class Problem05 {
    public static void main(String[] args) {
        Employee emp = new Employee("Shahajalal", 22, "Software Engineer");
        System.out.println();

        emp.displayInfo();
    }
}
