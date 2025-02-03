public class Problem03 {

    public static class P {
        private double x, y;

        public P(double x, double y) {
            this.x = x;
            this.y = y;
        }

        public double gx() {
            return x;
        }

        public double gy() {
            return y;
        }
    }

    public static class D {
        public double d(P p1, P p2) {
            double dx = p2.gx() - p1.gx();
            double dy = p2.gy() - p1.gy();
            return Math.sqrt(dx * dx + dy * dy);
        }
    }

    public static void main(String[] args) {
        P p1 = new P(2.5, 4.0);
        P p2 = new P(7.5, 9.0);

        D c = new D();
        double res = c.d(p1, p2);

        System.out.println("Distance: " + res);
    }
}
