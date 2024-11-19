package exp_4_3;
import java.util.Scanner;
public class ExceedChar {
public static void  main(String[] args) {
	Scanner in = new Scanner(System.in);
	System.out.println("enter the string");
	String st = in.nextLine();
	System.out.println("enter the number");
	int[] arr = new int[256];
	for(int i = 0 ; i < 257 ; i++) {
		arr[i] = st.charAt(i);
	}
	int n = in.nextInt();
	for(int i = 0 ; i < st.length() ; i ++) {
		
	}
}
}
