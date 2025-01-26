public class Problem10 {

    static class NestedClass {
        void display() {
            System.out.println("This is a static nested class.");
        }
    }

    class InnerClass {
        void display() {
            System.out.println("This is a non-static inner class.");
        }
    }

    public static void main(String[] args) {

        Problem10.NestedClass obj = new Problem10.NestedClass();
        obj.display();

        Problem10 obj1 = new Problem10();
        Problem10.InnerClass obj2 = obj1.new InnerClass();
        obj2.display();
    }
}
