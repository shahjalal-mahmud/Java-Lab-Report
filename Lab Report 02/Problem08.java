import java.util.Scanner;
public class Problem08 {
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
        int largest = arr[0];
        int secondLargest = 0;
        for(int i = 0; i<size; i++){
            if (largest < arr[i]) {
                secondLargest = largest;
                largest = arr[i];
            }
        }
        System.out.println("\nSecond largest element: " + secondLargest);
        input.close();
    }
}