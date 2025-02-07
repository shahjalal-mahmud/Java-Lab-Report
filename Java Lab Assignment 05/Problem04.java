class Parent {

    private String name;
    protected int age;
    public String gender;

    public Parent(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public void Display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
    }

}

class Child extends Parent {

    public Child(String name, int age, String gender) {
        super(name, age, gender);
    }

    public void Show() {
        // System.out.println("Name: " + name); //  Error: Not accessible (Private)
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
    }
}

public class Problem04 {

    public static void main(String[] args) {
        Parent p = new Parent("Afifah Tasnova", 19, "Female");
        p.Display();
        Child c = new Child("Afifah Tasnova", 19, "Female");
        c.Show();   // The name field is not accessible in the Child class
    }
}
