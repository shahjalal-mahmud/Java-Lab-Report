class Circle{
    private double radius;
    private String color;
    public Circle(){
        radius = 1.0;
        color = "red";
    }
    public Circle(double radius){
        this.radius = radius;
        color = "red";
    }
    public double getRadius(){
        return radius;
    }
    public String getColor(){
        return color;
    }
}
public class Question01 {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        System.err.println("The Radius: "+ c1.getRadius());
        System.err.println("The Color: "+ c1.getColor());

        Circle c2 = new Circle(5.5);
        System.err.println("The Radius: "+ c2.getRadius());
        System.err.println("The Color: "+ c2.getColor());
    }
}