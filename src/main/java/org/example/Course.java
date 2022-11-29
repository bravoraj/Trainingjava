package org.example;
import java.util.Scanner;
public class Course {
    public static void main(String[] args) {
        int j=0,k=0;
        Scanner sc = new Scanner(System.in);
        String[] course = new String[5];
        String[] courseIdDomain=new String[5];
        String[] courseNameDomain=new String[5];
        System.out.println("Enter 5 course subject");
            for(int i=0;i<5;i++) {
                course[i] = sc.next();
                if (course[i].contains("courseId")) {
                    courseIdDomain[j] = course[i];
                    j++;
                } else if (course[i].contains("courseName")) {
                    courseNameDomain[k] = course[i];
                    k++;
                }
            }
                System.out.println("course is available" );
                for(int i=0;i<courseNameDomain.length;i++){
                    System.out.println("course is available");
                }
        System.out.println("COURSE NOT FOUND" );
        for(int i=0;i<courseIdDomain.length;i++){
            System.out.println("COURSE NOT FOUND");

        }
    }
}
