import java.util.Scanner;

public class Problem06 {
    static boolean is_Prime(int n){
        if (n <=1) {
            return false;
        }
        for(int i = 2; i<n; i++){
            if (n%i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        if (is_Prime(num)) {
            System.out.println("Prime");
        }
        else{
            System.out.println("Not Prime");
        }
        input.close();
    }
}
