package exp2;
import java.util.Scanner;

class cost{
	int total_expenses(int a , int b , int c , int d) {
		return (a*b)+c+d;
	}
}
public class car_expenses {
	public static void main(String[] args) {
		cost cp = new cost();
		Scanner in = new Scanner(System.in);
		System.out.println("enter total miles driven by the car");
		int a = in.nextInt();
		System.out.println("cost per gallon");
		int b = in.nextInt();
		System.out.println("average fees per day");
		int c = in.nextInt();
		System.out.println("toll tax");
		int d = in.nextInt();
		int exp = cp.total_expenses(a, b, c, d);
		System.out.println("the total expenses is "+exp);
	}

}
