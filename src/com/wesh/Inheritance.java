package com.wesh;

//Inheritance
public class Inheritance extends Functions {
    public static void main(String[] args) {
        Functions.sayHi("Pato");
        add(45,56);
        sayHi("Extended");
        System.out.println(m);
        devide(10, 3);
    }
    //We can overide to customise functions

    public static void sayHi(String name){
        System.out.println("Hi " +name+ "  From extended Lesson");
    }
}
