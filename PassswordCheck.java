package exp_4_2;
import java.util.Scanner;

public class PassswordCheck {
    public static void main(String[] args) {  // Changed System[] args to String[] args
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the password:");
        String s = in.nextLine();
        
        if (check(s)) {
            System.out.println("Password is valid");
        } else {
            System.out.println("Password is invalid");
        }
        
        in.close();  // Closing the Scanner object to avoid resource leaks
    }

    public static boolean check(String s) {
        if (s.length() < 5 || s.length() > 12) {
            return false;
        }

        boolean hasLowerCase = false;
        boolean hasDigit = false;
       

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            
            }
            if (c >= 'a' && c <= 'z') {
                hasLowerCase = true;
            }
            if (c >= '0' && c <= '9') {
                hasDigit = true;
            }
            if (c < 'a' || c > 'z') {
                if (c < '0' || c > '9') {
                    return false;
                }
            }
            if (i > 0 && c == s.charAt(i - 1)) {
                return false;
            }
        }
        return hasLowerCase && hasDigit ;
    }
}
