public class Problem01 {

    public double area(double n, double num) {
        return n * num;
    }

    public double area(double n) {
        return Math.PI * n * n;
    }

    public static void main(String[] args) {
        Problem01 p = new Problem01();
        double n = 5.5;
        double num = 6.5;
        double res = p.area(n, num);
        System.err.println();
        System.out.println("Area of rectangle: " + res);
        double r = 7.5;
        double res1 = p.area(r);
        System.out.println("Area of circle: " + res1);
    }
}
