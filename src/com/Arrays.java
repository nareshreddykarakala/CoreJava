package com;

public class Arrays {

    public static void main(String[] args) {
        String [] []str= new String[][]{{"1","2","3","4"},{"4","5","6","7"},{"7","8","9","56"},{"10","11","12","67"}};

        for (int i=0;i< str.length;i++) {
            for (int j = 0; j <str.length ; j++) {
                System.out.print(str[i][j]+" ");
            }
System.out.println();

        }
    }
}
