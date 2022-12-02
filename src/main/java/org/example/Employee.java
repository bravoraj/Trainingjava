package org.example;
import java.util.Scanner;
public class Employee {
    int empId;
    String empName;
    static long empAge;
    Employee(int empId, String empName,long empAge,int date){
        return;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Employee employee1 = new Employee(11, "Rajesh", 22, 22-12-2021);
        Employee employee2 = new Employee(12, "Kumar", 25, 23-12-2020);
        Employee employee3 = new Employee(13, "Priya", 21,15-2-2019);
        Employee employee4 = new Employee(14, "Naveen", 50,16-06-2021);
        Employee employee5 = new Employee(15, "rajkumar", 45,29-06-2018);


    }
}