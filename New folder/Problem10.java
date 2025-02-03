public class Problem10 {

    static class StaticNested {

        void show() {
            System.out.println("This is a static nested class.");
        }
    }

    class NonStaticInner {

        void show() {
            System.out.println("This is a non-static inner class.");
        }
    }

    public static void main(String[] args) {

        Problem10.StaticNested obj1 = new Problem10.StaticNested();
        obj1.show();

        Problem10 obj2 = new Problem10();
        Problem10.NonStaticInner obj3 = obj2.new NonStaticInner();
        obj3.show();
    }
}
