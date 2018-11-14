package com.wesh;

import java.util.Scanner;

public class Intro {
    public static void main(String[] args) {
        String sentence ="  The Guy Jumpd over the pole";
        System.out.println(sentence.toUpperCase());
        System.out.println(sentence.length());
        String sentence2= sentence.toUpperCase();
        int lenth= sentence.length();
        String small= sentence.toUpperCase().trim().substring(7);
        String x= "13";
        String y= "13.8";
        int xx= Integer.parseInt(x);
        double yy= Double.parseDouble(y);
        System.out.println(xx*14);
        System.out.println(small);
        System.out.println(yy);

        try {
            int results= Integer.parseInt(y);
        } catch (Exception e) {
            System.out.println("Invalid Values");

        }

        int value= 97;

        Scanner s= new Scanner(System.in);
        System.out.println("Enter Your Age :");
        int z = s.nextInt();
        System.out.println( "Your Age is " + z);
        System.out.println("You were born in " + (2018-z) );

        System.out.println("Enter Your Weight :");
        double w = s.nextDouble();

        System.out.println("The square root of your Weight is " + Math.sqrt(w) );



    }
}
