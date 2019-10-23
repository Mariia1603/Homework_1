package com.task_one;

public class Main {

    public static void main(String[] args) {

	    int number = 123;

	    int a = number / 100;
        System.out.println(a);

        int b = number / 10 % 10;
        System.out.println(b);

        int c = number % 10;
        System.out.println(c);

        System.out.println("" + a + b + c);



    }
}
