package org.example;

import java.util.Objects;

class account {
    private final int accountNumber;
    private final String accountName;
    private final char accountBalance;

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getAccountName() {
        return accountName;
    }

    public char getAccountBalance() {
        return accountBalance;
    }

    public account(int accountNumber, String accountName, char accountBalance){
        this.accountNumber = accountNumber;
        this.accountName = accountName;
        this.accountBalance = accountBalance;


    }
}
