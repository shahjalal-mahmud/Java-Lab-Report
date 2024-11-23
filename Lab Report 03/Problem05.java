import java.util.Scanner;
public class Problem05 {
    static int factorial(int n){
        if (n==0 || n==1) {
            return 1;
        }
        return n * factorial(n-1);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        int factorial = factorial(num);
        System.out.println("Factorial: " + factorial);
        input.close();
    }
}
