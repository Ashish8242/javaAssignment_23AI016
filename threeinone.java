package com.basic.java;

import java.util.Scanner;

class Cal {
    int sum(int a, int b, int c) {
        return a + b + c;
    }

    int product(int a, int b, int c) {
        return a * b * c;
    }

    int average(int a, int b, int c) {
        return (a + b + c) / 3;
    }

    String compare(int a, int b, int c) {
        if (a >= b && a >= c) {
            return "a is the greatest";
        } else if (b >= a && b >= c) {
            return "b is the greatest";
        } else {
            return "c is the greatest";
        }
    }
}

public class threeinone {
    public static void main(String[] args) {
        Cal cl = new Cal();
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int a = in.nextInt();

        System.out.print("Enter the second number: ");
        int b = in.nextInt();

        System.out.print("Enter the third number: ");
        int c = in.nextInt();

        int sum = cl.sum(a, b, c);
        int pro = cl.product(a, b, c);
        int avg = cl.average(a, b, c);
        String com = cl.compare(a, b, c);

        System.out.println("The sum is " + sum);
        System.out.println("The product is " + pro);
        System.out.println("The average is " + avg);
        System.out.println("The greatest number is " + com);
    }
}
