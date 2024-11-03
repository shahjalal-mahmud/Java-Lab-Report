
public class Problem05 {
    public static void main(String[] args) {
        int x, y;
        x = 20;
        y = 10;
        System.out.println("Before swap: x = " + x + ", y = " + y);
        
        int temp = x;
        x = y;
        y = temp;

        System.out.println("After swap: x = " + x + ", y = " + y);
    }
}
