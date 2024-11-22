package lab5;


class InvalidHexadecimalException extends Exception {
 public InvalidHexadecimalException(String message) {
     super(message);
 }
}

public class HexadecimalChecker {
 
 public static void checkHexadecimal(String input) throws InvalidHexadecimalException {
    
     if (!input.matches("^[0-9a-fA-F]+$")) {
         throw new InvalidHexadecimalException("The given string is not a valid hexadecimal number.");
     }
     System.out.println("The given string is a valid hexadecimal number.");
 }

 public static void main(String[] args) {
     
     String testString = "1A3F"; 

     try {
       
         checkHexadecimal(testString);
     } catch (InvalidHexadecimalException e) {
         
         System.out.println("Exception: " + e.getMessage());
     } finally {
        
         System.out.println("Ending the program.");
     }
 }
}

