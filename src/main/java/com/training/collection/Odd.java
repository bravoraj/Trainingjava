package com.training.collection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class Odd {

    public static void main(String[] args){

        int sum=0;
        List<Integer> emp = new ArrayList<>();
        emp.add(11);
        emp.add(13);
        emp.add(4);
        emp.add(15);
        emp.add(21);
        System.out.println("Sum of Odd numbers :");
        for (Integer e : emp) {
            if(e%2!=0)
                sum=sum+e;
        }
        System.out.println(sum);
    }
}
