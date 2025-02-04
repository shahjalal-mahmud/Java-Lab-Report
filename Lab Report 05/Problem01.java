class Animal {

    public String name;
    public int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void Display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age + " years");
    }
}

class Dog extends Animal {

    public Dog(String name, int age) {
        super(name, age);
    }

    public void Bark() {
        System.out.println(name + " is barking: Gheu Gheu");
    }
}

public class Problem01 {
    public static void main(String[] args) {
        Dog d = new Dog("Tommy",3);
        d.Display();
        d.Bark();
    }
}
