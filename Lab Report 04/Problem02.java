
public class Problem02 {

    public static class Box {

        private double length;
        private double width;
        private double height;

        public Box() {
            this.length = 1;
            this.width = 1;
            this.height = 1;
        }

        public Box(double side) {
            this.length = side;
            this.width = side;
            this.height = side;
        }

        public Box(double length, double width, double height) {
            this.length = length;
            this.width = width;
            this.height = height;
        }

        public double Volume() {
            return length * width * height;
        }

        public void Display() {
            System.out.println("Length: " + length + ", Width: " + width + ", Height: " + height);
        }
    }

    public static void main(String[] args) {
        Box defaultBox = new Box();
        System.out.println("Default Box:");
        defaultBox.Display();
        System.out.println("Volume: " + defaultBox.Volume());

        Box cube = new Box(5);
        System.out.println("\nCube:");
        cube.Display();
        System.out.println("Volume: " + cube.Volume());

        Box rectangularBox = new Box(3, 4, 5);
        System.out.println("\nRectangular Box:");
        rectangularBox.Display();
        System.out.println("Volume: " + rectangularBox.Volume());
    }

}
