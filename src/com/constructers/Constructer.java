package com.constructers;

public class Constructer {
    private String str;
    private Integer i;

    public Constructer(String str) {
        System.out.println("String constucter"+str);//parametrized construter
    }
    public Constructer(Integer i) {
        System.out.println("integer"+i);//parametrized construter
    }

    public Constructer() {
        System.out.println("constructer");//No - arug constructer
    }


void method(){

}
    public static void main(String[] args) {
       new Constructer("Naresh");
        new Constructer(10);
        new Constructer();

    }
}
