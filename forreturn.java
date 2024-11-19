package exception_handeling;

public class forreturn {
  public static void main(String[] args) {
	  int j = test(65);
	  System.out.println("Value of j " +j);
  }
  public static int test(int i ) {
	  int j = 0 ; 
	  try {
		  j = i /(i-9);
		 
	  }
	  catch(ArithmeticException ex) {
		  System.out.println("Divide by zero");
		  return 0;
	  }
	  return j;
	  
  }
}
