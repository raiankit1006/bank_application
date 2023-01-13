package com.akki;

import java.util.UUID;

public class SBIUser implements BankInterface {

    private String name;
    private String accno;
    private String pass;
    private double balance;
    private  static double rateOfInterest;

    public SBIUser(String name, String pass, int balance)
    {
        this.name = name;
        this.pass = pass;
        this.balance = balance;

        this.rateOfInterest=6.5;
        this.accno = String.valueOf(UUID.randomUUID());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccno() {
        return accno;
    }

    public void setAccno(String accno) {
        this.accno = accno;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public static double getRateOfInterest() {
        return rateOfInterest;
    }

    public static void setRateOfInterest(double rateOfInterest) {
        SBIUser.rateOfInterest = rateOfInterest;
    }

    @Override
    public double checkBalance() {
        return this.balance;
    }

    @Override
    public String addMoney(int amount) {
        balance=amount+balance;
        return "your amount is :"+balance;
    }

    @Override
    public String withdrawMoney(int amount, String password)
    {
        if(pass.equals(password))
        {
            if(amount<balance)
                return "your amount is debited and current balance is:"+(balance-amount);
            else
                return "you don't have sufficient balance try again";
        }
        else
        {
            return "wrong password";
        }
    }

    @Override
    public double calculateInterest(int year) {
        return (balance*rateOfInterest*year)/100;
    }

}
