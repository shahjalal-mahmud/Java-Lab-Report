public class Problem07 {

    static int count = 0;

    public Problem07() {
        count++;
    }

    public static void displayCount() {
        System.out.println("Number of objects created: " + count);
    }

    public static void main(String[] args) {

        Problem07 obj1 = new Problem07();
        Problem07 obj2 = new Problem07();
        Problem07 obj3 = new Problem07();

        Problem07.displayCount(); 
    }
}
