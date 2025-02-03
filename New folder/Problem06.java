public class Problem06 {

    public static long fact(int n) {
        if (n == 0) {
            return 1;
        }
        return n * fact(n - 1);
    }

    public static void main(String[] args) {
        int num = 5;
        long result = fact(num);
        System.out.println("Factorial of " + num + " is: " + result);
    }
}
