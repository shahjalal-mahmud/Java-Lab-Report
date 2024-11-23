import java.util.Scanner;

public class Problem08 {
    static void mulTable(int n){
        for(int i = 1; i <=10; i++){
            System.out.println(n + " x " + i + " = " + i*n);
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        mulTable(num);
        input.close();
    }
}
