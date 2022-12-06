package com.training;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Sample {
    public static void main(String[] args){
        List<String> names =  Arrays.asList("Raj","Suresh","Sunil");
        names.stream().filter(n->n.startsWith("S")).map(x->x+" Morris").sorted().forEach(System.out:: println);
    }
}