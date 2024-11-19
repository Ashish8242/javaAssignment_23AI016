package exception_handeling;

public class demo {
  public static void main(String[] args) {
	  try {
		  String s = args[0];
		  int i = Integer.parseInt(s);
		  int j = i/(i-9);
		  System.out.println("Value of j" +j);
		  
	  }
	  catch(ArrayIndexOutOfBoundsException ex) {
		  System.out.println("command line argument is not passed");
		  
	  }
	  catch(NumberFormatException ex) {
		  System.out.println("string to int conversion");
	  }
	  catch(ArithmeticException ex) 
	   {
		  System.out.println("Divide by zero");
	  }
	  finally {
		  System.out.println("gsv rocks");
	  }
	  System.out.println("Main end");
  }
  
}
