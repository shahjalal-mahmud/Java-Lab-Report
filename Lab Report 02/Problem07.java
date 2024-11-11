import java.util.*;

public class Problem07 {
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
        Set<Integer> uniqueElements = new LinkedHashSet<>();
        for(int num : arr){
            uniqueElements.add(num);
        }
        System.out.println("Array without duplicates: " + uniqueElements);
        input.close();
    }
}
