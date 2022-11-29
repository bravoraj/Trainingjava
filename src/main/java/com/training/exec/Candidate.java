package com.training.exec;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Candidate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter candidate name:");
        String name = sc.next();
        try
        {
            if (name.matches("^[a-zA-Z]*$*")) {
                System.out.println();
            } else
            {
                throw new InputMismatchException();
            }
            System.out.println("enter candidate gender:");
            String gender = sc.next();
            if (gender.contains("M")) {
            }
            else if(gender.contains("F")){
                throw new InputMismatchException();
            }

            System.out.println("enter candidate Salary:");
            double salary = sc.nextDouble();
            if (salary < 10000)
            {
                throw new InvalidSalaryException("salary can not be less than 10000");

            }
        }
        catch(InputMismatchException | InvalidSalaryException e)
        {
            if(e instanceof InputMismatchException )
            {
                System.out.println("InputMismatchException");
                System.out.println(e.getMessage());
            }
            else {
                System.out.println("InvalidSalaryException");
                System.out.println(e.getMessage());
            }
        }
        finally
        {
            System.out.println("finally completed .....");
        }


    }
}