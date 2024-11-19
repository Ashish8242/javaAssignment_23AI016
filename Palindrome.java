package string;
import java.util.Scanner;


public class Palindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = in.nextLine();
        
        if (ispalindrome(s)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("NOT Palindrome");
        }
    }

    public static boolean ispalindrome(String s) {
        int low = 0;
        int high = s.length() - 1;
        
        while (low < high) {
            if (s.charAt(low) != s.charAt(high)) {
                return false;
            }
            low++;
            high--;
        }
        return true;
    }
}
