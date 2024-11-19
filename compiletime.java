package exception;

public class compiletime {
public static void main(String[] args) {
	System.out.println("Main start");
	try {
		test(9);
		
	}
	catch(ClassNotFoundException ex) {
		ex.printStackTrace();
	test(9);
	System.out.println("Main end");
}
public static void test(int i) throws ClassNotFoundException {
	System.out.println("test start");
	test1(9);
	System.out.println("test end");
}
public static void test1(int i ) throws ClassNotFoundException {
	System.out.println("Main start");
	try {
		test2(9);
		
	}
	catch(ClassNotFoundException ex) {
		ex.printStackTrace();
	}
	System.out.println("TEST1 END");
}
public static void test2(int i) throws ClassNotFoundException {
	System.out.println("test2 start");
	   Class.forName("");
	System.out.println("test2 end");
}
}
