package com.training.exec;

public class InvalidSalaryException extends Exception{
    public InvalidSalaryException(String s)
    {

        super(s);
    }

    @Override
    public String toString() {
        return "InvalidSalaryException{}";
    }
}