public class Problem06 {

    public static long Factorial(int num) {
        if (num == 0) {
            return 1;
        }
        return num * Factorial(num - 1);
    }
    public static void main(String[] args) {
        int num = 5;
        long factorial = Factorial(num);
        System.out.println("Factorial of " + num + " is: " + factorial);
    }
}
