public class Problem02 {

    public static class B {
        private double l;
        private double w;
        private double h;

        public B() {
            this.l = 1;
            this.w = 1;
            this.h = 1;
        }

        public B(double s) {
            this.l = s;
            this.w = s;
            this.h = s;
        }

        public B(double l, double w, double h) {
            this.l = l;
            this.w = w;
            this.h = h;
        }

        public double v() {
            return l * w * h;
        }

        public void d() {
            System.out.println("L: " + l + ", W: " + w + ", H: " + h);
        }
    }

    public static void main(String[] args) {
        B b1 = new B();
        System.out.println("Default:");
        b1.d();
        System.out.println("V: " + b1.v());

        B b2 = new B(5);
        System.out.println("\nCube:");
        b2.d();
        System.out.println("V: " + b2.v());

        B b3 = new B(3, 4, 5);
        System.out.println("\nRect:");
        b3.d();
        System.out.println("V: " + b3.v());
    }
}
