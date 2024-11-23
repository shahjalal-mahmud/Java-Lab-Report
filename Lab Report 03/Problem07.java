import java.util.Scanner;

public class Problem07 {
    static int sumDigit(int n){
        int sum = 0;
        int lastDigit = 0;
        while (n > 0) {
            lastDigit = n % 10;
            sum += lastDigit;
            n = n/10;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        System.out.println("Sum of digits: " + sumDigit(num));
        input.close();
    }
}
