package com.akki;

import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
	// write your code here
        System.out.println("enter the username , password, balance");
        Scanner sc = new Scanner(System.in);
        String user = sc.nextLine();
        String password = sc.nextLine();
        int balance = sc.nextInt();

        SBIUser a = new SBIUser(user, password, balance);
        // check the balance
        System.out.println(a.checkBalance());

        // add money
        System.out.println("enter how much money you want to add");
        int money=  sc.nextInt();
        System.out.println(a.addMoney(money));

        // interest rate
        System.out.println("enter year for interest");
        int year = sc.nextInt();
        System.out.println(a.calculateInterest(3));

        //withdraw money
        System.out.println("enter debit money, password");
           int debit = sc.nextInt();
           String pas = sc.nextLine();
            pas = sc.nextLine();
        System.out.println(a.withdrawMoney(debit, pas));



    }
}
