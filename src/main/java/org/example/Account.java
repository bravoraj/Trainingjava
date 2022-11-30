package org.example;

public class Account implements Cloneable {

    public void dailyTransaction(int day) {
        System.out.println("Nov"+day+"Trans");
    }

    public double deposit(double deposit) {
        this.balance=balance+deposit;
        return balance;
    }

    public double withdraw(double withdraw) {
        this.balance=balance-withdraw;
        return balance;
    }

    private double accountNumber;
    private String accountName;
    private double balance;
    public Account( String accountName,double accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.accountName = accountName;
        this.balance = balance;
    }
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }

    public double getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(double accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    public Account() {

    }

}