import java.util.*;
public class Problem06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the size of the first array: ");
        int size1 = input.nextInt();
        int[] arr1 = new int[size1];
        System.out.print("Enter elements of the first array: ");
        for (int i = 0; i < size1; i++) {
            arr1[i] = input.nextInt();
        }

        System.out.print("Enter the size of the second array: ");
        int size2 = input.nextInt();
        int[] arr2 = new int[size2];
        System.out.print("Enter elements of the second array: ");
        for (int i = 0; i < size2; i++) {
            arr2[i] = input.nextInt();
        }

        int[] mergedArray = new int[size1 + size2];
        for (int i = 0; i < size1; i++) {
            mergedArray[i] = arr1[i];
        }
        for (int i = 0; i < size2; i++) {
            mergedArray[size1 + i] = arr2[i];
        }

        System.out.println("Merged Array: " + Arrays.toString(mergedArray));

        input.close();
    }
}
