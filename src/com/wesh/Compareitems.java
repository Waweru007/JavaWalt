package com.wesh;

import java.util.Scanner;

public class Compareitems {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the first number :");
        int x = s.nextInt();

        System.out.println("Enter the second number :");

        int y = s.nextInt();

        System.out.println();

        if ( x == y ) {
            System.out.printf("The two numbers are equal");
        }
        else if ( x > y )
            System.out.printf( "X is greater than Y");
        else
            System.out.printf( "X is less than Y");


    }
}
