package com.task_two;

public class Main2 {
    public static void main(String[] args) {

        double funts = 5.0;
        double gramm = funts * 453.6;
        System.out.println(gramm);

        double kg=gramm/1000;
        int kg2=(int)kg;

        System.out.println(kg);
        System.out.println(kg2);

        double gr2=kg-kg2;
        System.out.println(gr2);

    }

}
