package com.basic.java;
import java.util.Scanner;

class Answer {
    String comparison(int a, int b) {
        if (a > b) {
            return "a is greater than b";
        } else if (a < b) {
            return "b is greater than a";
        } else {
            return "both are equal";
        }
    }
}

public class compare {
    public static void main(String[] args) {
        Answer as = new Answer();
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int a = in.nextInt();
        
        System.out.print("Enter the second number: ");
        int b = in.nextInt();
        
        String result = as.comparison(a, b);
        System.out.println(result);
    }
}
