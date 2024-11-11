import java.util.Scanner;
public class Problem10 {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the size of an Array: ");
        int size = input.nextInt();
        int arr[] = new int[size];
        for(int i = 0; i<size; i++){
            System.out.print("Enter a value for element (" + (i+1) + "): ");
            arr[i] = input.nextInt();
        }
        System.out.print("Array: ");
        for(int i = 0; i<size; i++){
            System.out.print( arr[i] + " ");
        }

        System.out.print("\nEnter target sum: ");
        int sum = input.nextInt();
        boolean pair = false;
        for(int i = 0; i<size-1; i++){
            for(int j = i+1; j <size; j++){
                if (arr[i] + arr[j] == sum) {
                    System.out.println("Pair found: (" + arr[i] + ", " + arr[j] + ")");
                    pair = true;
                    break;
                }
            }
            if (pair) {
                break;
            }
        }
        if (!pair) {
            System.out.println("Pair not found.");
        }
        input.close();
    }
}
