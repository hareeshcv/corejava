package com.dbcore.Exceptions;

/**
 * Project: CoreJava
 * Author: test
 * Note:
 * To change this template use File | Settings | File Templates.
 */
// File Name InsufficientFundsException.java
import java.io.*;

public class InsufficientFundsException extends Exception
{
    private double amount;
    public InsufficientFundsException(double amount)
    {
        this.amount = amount;
    }
    public double getAmount()
    {
        return amount;
    }
}