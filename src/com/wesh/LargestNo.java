package com.wesh;

import java.util.Scanner;

public class LargestNo {

    public static void main(String args[])
    {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the first number :");
        int x1 = s.nextInt();
        System.out.println("Enter the second number :");
        int x2 = s.nextInt();
        System.out.println("Enter the third number :");
        int x3 = s.nextInt();
        System.out.println("Enter the fourth number :");
        int x4 = s.nextInt();
        System.out.println("Enter the fifth number :");
        int x5 = s.nextInt();
//        System.out.println(Math.max(x1,x2));
        System.out.println(Math.min(Math.min(Math.min(Math.min(x1,x2), x3), x4), x5));
    }
  }

