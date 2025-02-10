class Square {
    private double height;
    private double width;

    public Square() {
        this.height = 0;
        this.width = 0;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double h) {
        this.height = h;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double w) {
        this.width = w;
    }

    public double getArea() {
        return height * width;
    }
    @Override
    public  String toString(){
        return ("Height = " + height+"\nWidth = " + width);
    }
}

public class Question08 {
    public static void main(String[] args) {
        double h, w, a;
        Square s1 = new Square();
        s1.setHeight(3);
        s1.setWidth(4);
        h = s1.getHeight();
        w = s1.getWidth();
        a = s1.getArea();

        System.err.println(s1);
        System.out.println("Area = " + a);
    }
}