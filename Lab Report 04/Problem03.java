public class Problem03 {

    public static class Point {

        private double x;
        private double y;

        public Point(double x, double y) {
            this.x = x;
            this.y = y;
        }

        public double getX() {
            return x;
        }

        public double getY() {
            return y;
        }
    }

    public static class Distance {

        public double distance(Point p1, Point p2) {
            double dx = p2.getX() - p1.getX();
            double dy = p2.getY() - p1.getY();
            return Math.sqrt(dx * dx + dy * dy);
        }
    }
    public static void main(String[] args) {

        Point point1 = new Point(2.5, 4.0);
        Point point2 = new Point(7.5, 9.0);

        Distance c = new Distance();

        double distance = c.distance(point1, point2);

        System.out.println("Distance between the two points: " + distance);
    }
}
