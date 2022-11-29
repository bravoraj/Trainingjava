package org.example;
import java.util.Scanner;
public class Email {
    public static void main(String args[]){
        int j=0,l=0;
        Scanner sc = new Scanner(System.in);
        String[] emails = new String[4];
        String[] gmailDomain=new String[4];
        String[] yahooDomain=new String[4];
        System.out.println("Enter 4 email addresses");
        for(int i=0;i<4;i++){
            emails[i]=sc.next();
            if (emails[i].contains("gmail")){
                gmailDomain[j]=emails[i];
                j++;
            }
            else if(emails[i].contains("yahoo")){
                yahooDomain[l]=emails[i];
                l++;
            }
        }
        System.out.println("Gmail::"+ 1 +"Yahoo::" );
        for(int i=0;i<gmailDomain.length & i<yahooDomain.length ;i++){
            System.out.println(gmailDomain[i]);
            System.out.println(yahooDomain[i]);
        }


        }
    }


