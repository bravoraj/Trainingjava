package org.example;

import java.util.Scanner;

public class PowerConnections {
    public double electicBill(int units,String type) {
        int totalamount;
        if (type.equalsIgnoreCase("industrial")) {
            totalamount=units*5;
            if (totalamount<=1000) {
                totalamount=totalamount / 2;
            }
            totalamount=totalamount+250;

        }
        else{
            totalamount = (units*8)+500;
            if(totalamount<=8500){
                totalamount=totalamount-((totalamount*10)/100);
            }
        }
        return totalamount;


    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter the connection type");
        String ct = s.next();
        System.out.println("enter the units");
        int u=s.nextInt();
        PowerConnections pc = new PowerConnections();
        System.out.println(pc.electicBill(u,ct));
    }
}