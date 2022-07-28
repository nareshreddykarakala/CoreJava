package com.sample2;

import com.sample.Test;

public class Modifiers extends Test {

    void m4(){
        System.out.println(30);
    }

    public static void main(String[] args) {
        int a=10;
        int b=20;
        int c=10;
        int d=15;

        System.out.println(a==b);//false
        System.out.println(a!=b || a==c);
        System.out.println(a!=c && b!=c);
        System.out.println(a!=c || b==c);


    }
}
