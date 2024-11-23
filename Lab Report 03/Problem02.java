import java.util.Scanner;

public class Problem02 {
    static boolean Is_Even(int n){
        if (n %2 == 0) {
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        if (Is_Even(num)) {
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }
        input.close();
    }
}
