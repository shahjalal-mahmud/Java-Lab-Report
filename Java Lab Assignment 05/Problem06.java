class Animal {
    String name;

    public Animal(String name) {
        this.name = name;
    }

    public void eat() {
        System.out.println(name + " is eating.");
    }
}

class Mammal extends Animal {
    public Mammal(String name) {
        super(name);
    }

    public void walk() {
        System.out.println(name + " is walking.");
    }
}

class Dog extends Mammal {
    public Dog(String name) {
        super(name); 
    }

    public void bark() {
        System.out.println(name + " is barking: Gheu Gheu");
    }
}

public class Problem06 {
    public static void main(String[] args) {
        Dog dog = new Dog("Shelbi");

        dog.eat();   // Inherited from Animal
        dog.walk();  // Inherited from Mammal
        dog.bark();  // Defined in Dog
    }
}
