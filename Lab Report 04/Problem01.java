public class Problem01 {

    public double Area(double a, double b) {
        return a * b;
    }

    public double Area(double a) {
        return Math.PI * a * a;
    }
    public static void main(String[] args) {
        Problem01 p = new Problem01();
        double a = 5.5;
        double b = 6.5;
        double area = p.Area(a, b);
        System.out.println("Area of rectangle: " + area);
        double c = 7.5;
        double area1 = p.Area(c);
        System.out.println("Area of circle: " + area1);
    }
}
