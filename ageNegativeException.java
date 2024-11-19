package createException;

public class ageNegativeException extends RuntimeException {
  public ageNegativeException(String msg) {
	  super(msg);
  }
}
