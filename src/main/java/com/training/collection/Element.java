package com.training.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class Element {

    public static void main(String[] args){

        List<Integer> emp = new ArrayList<>();
        emp.add(11);
        emp.add(12);
        emp.add(13);
        emp.add(14);
        emp.add(15);
        System.out.println("Odd number :");
        for (Integer e : emp) {
            if(e%2!=0)
                System.out.println(e);
        }
    }
}
