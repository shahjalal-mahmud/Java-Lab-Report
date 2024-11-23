import java.util.Scanner;

public class Problem09 {
    static int countVowels(String s){
        int count = 0;
        s = s.toLowerCase();
        for(int i = 0; i<s.length(); i++){
            char ch = s.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = input.nextLine();
        System.out.println("Number of vowels: " + countVowels(str));
        input.close();
    }
}
