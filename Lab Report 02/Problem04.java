import java.util.*;
public class Problem04 {
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
        for(int i = 0, j = size-1; i<j; i++, j--){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        System.out.print("\nReversed array: ");
        for(int i = 0; i<size; i++){
            System.out.print( arr[i] + " ");
        }
        input.close();
    }
}
