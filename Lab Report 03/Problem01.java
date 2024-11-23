import java.util.Scanner;

public class Problem01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int size = input.nextInt();
        int[] arr = new int[size];
        System.out.print("Enter elements: ");
        for(int i = 0; i<size; i++){
            arr[i] = input.nextInt();
        }
        int sum = 0;
        for(int i: arr){
            sum += i;
        }
        System.out.println("Sum of array elements: " + sum);
        input.close();
    }
}