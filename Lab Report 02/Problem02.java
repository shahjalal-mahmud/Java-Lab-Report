import java.util.*;
public class Problem02 {
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
        int max = arr[0];
        for(int i = 0; i<size; i++){
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        System.out.println("\nLargest element: " + max);
        input.close();
    }
}
