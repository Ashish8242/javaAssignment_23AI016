package COM.JAVA.EXP1;
import java.util.Scanner;
class figure{
	double r;
	double a;
	double v;
	
	public figure(double r , double a , double v) {
		this.r = r;
		this.a = a ; 
		this.v = v;
		
	}
	public void dispVolume() {
	  System.out.println("the volume is " + v);
	}
	public void dispArea() {
		System.out.println("the area is " + a);
	}
	
}
class cone extends figure{
	private double h ;
	private double s;
	public cone(double r,double h , double s) {
		super(r,0,0);
		this.h = h;
		this.s = s;
	}
	public void calcArea() {
		a = Math.PI*r*s + Math.PI*r*r;
	}
	public void calcVolume() {
		 v = (Math.PI*r*s)/3;
	}
	public void dispArea() {
		System.out.println("area of cone : " + a);
	}
	public void dispVolume() {
		System.out.println("volume of cone is "+v);
	}
	
}
public class inheritanceDemo {
	public static void main(String[] args) {
	
		Scanner in = new Scanner(System.in);
		System.out.println("ENTER THE RADIUS");
		double r = in.nextDouble();
		System.out.println("ENTER THE HEIGHT");
		double h = in.nextDouble();
		System.out.println("enter slant height");
		double s = in.nextDouble();
		cone cn = new cone(r,h,s);
		
		cn.calcArea();
		cn.calcVolume();
		
		cn.dispArea();
		cn.dispVolume();
	}
  
}
