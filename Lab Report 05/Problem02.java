class Animal {
    String name;

    public Animal(String name) {
        this.name = name;
    }

    public void display() {
        System.out.println("Animal Name: " + name);
    }
}

class Dog extends Animal {
    String breed;
    public Dog(String name, String breed) {
        super(name);
        this.breed = breed;
    }
    public void bark() {
        System.out.println(name + " is barking: Gheu Gheu");
    }
    @Override
    public void display() {
        super.display();
        System.out.println("Breed: " + breed);
    }
}

public class Problem02 {
    public static void main(String[] args) {
        Dog myDog = new Dog("Tommy", "Desi Kutta");
        myDog.display(); 
        myDog.bark();
    }
}
