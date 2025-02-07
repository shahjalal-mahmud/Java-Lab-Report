class Shape {
    void draw() {
        System.out.println("Drawing a shape...");
    }
}

class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a Circle...");
    }
}

class Rectangle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a Rectangle...");
    }
}

public class Problem07 {
    public static void main(String[] args) {
        Shape shape1 = new Circle(); // Runtime polymorphism
        Shape shape2 = new Rectangle(); // Runtime polymorphism

        shape1.draw(); 
        shape2.draw();
    }
}
