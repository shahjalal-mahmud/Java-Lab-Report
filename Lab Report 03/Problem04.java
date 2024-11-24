import java.util.Scanner;
public class Problem04 {
    static boolean is_Leap(int y){
        if ((y % 4 == 0 && y % 100 != 0) || (y % 400 == 0)) {
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = input.nextInt();
        if (is_Leap(year)) {
            System.out.println("Leap Year");
        }
        else{
            System.out.println("Not a Leap Year");
        }
        input.close();
    }
}
