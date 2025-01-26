final class FinalClass {

    final int finalVar = 10;

    public final void finalMethod() {
        System.out.println("This is a final method.");
    }

    public void display() {
        System.out.println("Value of finalVar: " + finalVar);
    }
}

public class Problem09 {

    public static void main(String[] args) {
        
        FinalClass obj = new FinalClass();
        obj.display();
        obj.finalMethod();
    }
}
