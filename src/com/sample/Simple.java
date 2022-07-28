package com.sample;

public class Simple {
    int a=10;//instance variable
static int c=30;//static variable
    void m1(){
int b=20;//local variable
    }
   void m2(){
        System.out.println(this.c);
        System.out.println(this.a);
    }


    static  void m3(){
        System.out.println(c);
    }

    public static void main(String[] args) {
        Simple simple = new Simple();
        simple.m2();
        simple.m1();

    }
}
