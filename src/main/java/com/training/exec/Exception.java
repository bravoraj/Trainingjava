package com.training.exec;
import java.util.Scanner;
public class Exception extends Throwable {
    public Exception(String s) {
    }

    public static void main(String[] args) {
        int k = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the array size");
        int x = sc.nextInt();
        int[] arr = new int[x];
        try {
        for (int i = 0; i<x; i++) {
            arr[k] = sc.nextInt();
            k++;
        }
        System.out.println("enter the array value to search");
        int m = sc.nextInt();
            try {
                System.out.println(arr[m-1]);
            }
            catch (IndexOutOfBoundsException e)
            {
                System.out.println("find and enter a value inside the array");
            }
        }
        finally
        {
            System.out.println("finally completed...");
        }
    }
}
