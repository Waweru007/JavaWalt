package com.wesh;

public class Functions {

    protected static void devide (int a, int b){    //we can access a protected file only within the package name(com.Wesh)
        System.out.println(a/b);
    }
    private static void multiply (int x, int y){    //we can access within the same class
        System.out.println(x*y);
    }
    public static void add (int a, int b, int c) {   //Public are accessed anywhere
        System.out.println(a+b+c);

    }

    public void subtract (int a, int b){
        System.out.println(a-b*k);
    }

    public static void sayHi( String name ) {
        System.out.println("Hello " + name );
    }
    public static void add( int age, int heignt) {
        System.out.println(age+heignt);

    }
    public static void add(double xpoint, double ypoint){
        System.out.println(xpoint+ypoint);
    }
    public static void main(String[] args) {
        sayHi("Mike");
        sayHi("Peter");
        System.out.println(m);

        add(34, 56);
        add(24, 56, 57);
        add(98.5, 56.5);
        multiply(4, 5);


        //Access non static functions
        //instantiate  class first as shown below
        Functions funcs= new Functions();   //this is a contractor in that it has constrated the function
        funcs.subtract(91, 90);
        System.out.println(m);


    }
    int k=100; //this is a global variable becasue its outside the functions
    static int m= 103;

}
