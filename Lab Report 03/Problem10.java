import java.util.Scanner;
public class Problem10 {
    static void calculate(int a, int b, char c){
        double result = 0;
        switch (c) {
            case '+':
                result = a + b;
                break;
            case '-':
                result = a - b;
                break;
            case '*':
                result = a * b;
                break;
            case '/':
                if (b != 0) {
                    result = a / b;
                }
                break;
            default:
                System.out.println("Invalid");
        }
        System.out.println("Result: " + result);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = input.nextInt();

        System.out.print("Enter operator (+, -, *, /): ");
        char operator = input.next().charAt(0);

        System.out.print("Enter second number: ");
        int num2 = input.nextInt();

        calculate(num1, num2, operator);
        input.close();
    }
}
