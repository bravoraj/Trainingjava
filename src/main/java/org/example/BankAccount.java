package org.example;

import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.*;
public class BankAccount {
    static Scanner input = new Scanner(System.in);
    String name, actype;
    int accNo, bal, amt;

    BankAccount(String name, int accNo, String actype, int bal)
    {
        this.name = name;
        this.accNo = accNo;
        this.actype = actype;
        this.bal = bal;
    }

    int deposit(){
        System.out.println("Enter amount to deposit:");
        amt = input.nextInt();
        if(amt < 0)
        {
            System.out.println("Invalid Amount");
            return 1;
        }
        bal = bal+amt;
        return 0;
    }

    int withdrwal()
    {
        System.out.println("Your Balance=" + bal);
        System.out.println("Enter amount to withdraw:");
        amt = input.nextInt();
        if(bal < amt)
        {
            System.out.println("Not sufficient balance.");
            return 1;
        }
        if(amt < 0)
        {
            System.out.println("Invalid Amount");
            return 1;
        }
        bal = bal - amt;
        return 0;
    }

    public static void main(String[] args)
    {
        System.out.println("Enter your Name: ");
        String raj = input.nextLine();
        System.out.println("Enter Account Number: ");
        int num = input.nextInt();
        System.out.println("Enter Account Type: ");
        String type = input.next();
        System.out.println("Enter Initial Balance: ");
        int bal = input.nextInt();
        BankAccount b1 = new BankAccount(raj, num, type,bal);
        int menu;
        System.out.println("Menu");
        System.out.println("1. Deposit Amount");
        System.out.println("2. Withdraw Amount");
        boolean quit = false;
        do
        {
            System.out.println("Please enter your choice: ");
            menu = input.nextInt();
            switch (menu)
            {
                case 1:
                        b1.deposit();
                        break;
                case 2:
                        b1.withdrwal();
                        break;
                case 3:
                        quit = true;
                        break;
            }
        }while(!quit);

    }

}
