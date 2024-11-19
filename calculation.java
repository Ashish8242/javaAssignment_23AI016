package com.basic.java;
import java.util.Scanner;

class result {
	
	    int sum(int a, int b) {
	        return a + b;
	    }

	    int product(int a, int b) {
	        return a * b;
	    }

	    int difference(int a, int b) {
	        return a - b;
	    }

	    int quotient(int a, int b) {
	        return a / b;
	    }
	}

	public class calculation {
	    public static void main(String[] args) {
	        result cl = new result(); // Corrected this line
	        Scanner in = new Scanner(System.in);

	        System.out.println("Enter two numbers:");
	        int a = in.nextInt();
	        int b = in.nextInt();

	        int sum_result = cl.sum(a, b);
	        int product_result = cl.product(a, b);
	        int subs = cl.difference(a, b);
	        int div = cl.quotient(a, b);

	        System.out.println("Sum is: " + sum_result);
	        System.out.println("Product is: " + product_result);
	        System.out.println("Difference is: " + subs);
	        System.out.println("Quotient is: " + div);
	    }
	}


