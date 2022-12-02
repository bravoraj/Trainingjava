package com.training.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class StudentsCollection {
    public static void main (String[] args){
        Students stud1=new Students(11, "Rajesh", 22, "RMK");
        Students stud2=new Students(12, "Kumar", 25, "RMK");
        Students stud3= new Students(13, "Priya", 21, "RMKCET");
        Students stud4= new Students(14, "Naveen", 50, "RMD");
        Students stud5=new Students(15, "rajkumar", 45, "RMK");
        Students stud6=new Students(16, "Yuvaraj", 45, "SRM");
        Scanner sc= new Scanner(System.in);
        List<Students> students = new ArrayList<>();
        students.add(stud1);
        students.add(stud2);
        students.add(stud3);
        students.add(stud4);
        students.add(stud5);
        students.add(stud6);
        List<Students> sameCollegeList = new ArrayList<>();
        System.out.println("Enter the college name");
        String cName = sc.next();
        for(Students student:students){
            if(student.getCollegeName().equalsIgnoreCase(cName)){
                sameCollegeList.add(student);
            }
        }

        for(Students stud:sameCollegeList){
            System.out.println(stud);
        }

    }

}