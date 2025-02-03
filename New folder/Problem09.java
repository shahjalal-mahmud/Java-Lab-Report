final class MyFinalClass {

    final int fVar = 10;

    public final void fMethod() {
        System.out.println("This is a final method.");
    }

    public void show() {
        System.out.println("fVar value: " + fVar);
    }
}

public class Problem09 {

    public static void main(String[] args) {
        
        MyFinalClass obj = new MyFinalClass();
        obj.show();
        obj.fMethod();
    }
}
