package org.example;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
public class FormattingDate {
    public static Date StringToDate(String dob) throws ParseException {
        //Instantiating the SimpleDateFormat class
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
        //Parsing the given String to Date object
        Date date = formatter.parse(dob);
        System.out.println("Date object value: " + date);
        return date;
    }
        public static void main(String args[]) throws ParseException {
            //Reading name and date of birth from the user
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter your name: ");
            String name = sc.next();
            System.out.println("Enter your date of birth (dd-MM-yyyy): ");
            String dob = sc.next();
            //Converting String to Date
            Date date = FormattingDate.StringToDate(dob);
            System.out.println("Select format: ");
            System.out.println(" a: dd-MM-yyyy || b: yyyy-MM-dd ");
            char ch = sc.next().toCharArray()[0];;
            switch (ch) {
                case 'a':
                    System.out.println("Date in in the format: dd-MM-yyyy");
                    System.out.println(new SimpleDateFormat("dd-MM-yyyy").format(date));
                    break;
                case 'b':
                    System.out.println("Date in the format: yyyy-MM-dd");
                    System.out.println(new SimpleDateFormat("yyyy-MM-dd").format(date));
                    break;
                default:
                    System.out.println("Model not found");
                    break;
            }
        }
    }



























/*import java.text.SimpleDateFormat;
import java.util.Date;
    public class Doj {
        public static void main(String args[]) {
            Date dt = new Date();
            SimpleDateFormat dateFormat;
            dateFormat = new SimpleDateFormat("E MMM dd yyyy");
            System.out.println("Date: "+dateFormat.format(dt));
        }
    }*/
