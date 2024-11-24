import java.util.Scanner;
public class Problem03 {
    static int Largest(int a, int b, int c) {
        if (a > b) {
            if (a > c) {
                return a;
            }
        } else if (b > a) {
            if (b > c) {
                return b;
            }
        }
        return c;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter three numbers: ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();
        int largest = Largest(num1, num2, num3);
        System.out.println("Largest number: " + largest);
        input.close();
    }
}
