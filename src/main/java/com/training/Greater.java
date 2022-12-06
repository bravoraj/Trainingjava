package com.training;

public class Greater {
    public static void main(String[] args) {

        GreaterInterface obj = (a, b) -> {
            if (a > b) {
                return a;
            }
            else{
                return b;
            }
        };
        System.out.println("Greater number is :"+obj.getGreater(20,50));


    }
}