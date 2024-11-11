import java.util.Scanner;
public class Problem09 {
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

        int lastElement = arr[size - 1];  
        for (int i = size - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = lastElement;

        System.out.print("\nRotated Array: ");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        input.close();
    }
}
