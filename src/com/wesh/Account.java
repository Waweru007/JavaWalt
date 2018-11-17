package com.wesh;

public class Account {
    String name;
    String accNo;
    double balance;
    String type="Savings";

    //Create a constractor==which is a fxn to set up data

    public Account(String name, String accNo, double balance, String type) {
        this.name = name;
        this.accNo = accNo;
        this.balance = balance;
        this.type = type;
    }

    public Account(String name, String accNo, double balance) {
        this.name = name;
        this.accNo = accNo;
        this.balance = balance;
    }

    //we create getters and setters


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccNo() {
        return accNo;
    }

    public void setAccNo(String accNo) {
        this.accNo = accNo;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void withdraw (int amount){
        if (balance> amount){
            balance-=Math.abs(amount);
            System.out.println("Withdrawn KES "+amount+"From account" +accNo);

        }else{
            System.out.println("Insuficient balance");
        }

    }

    public void deposit (int amount){
        balance+=Math.abs(amount);
        System.out.println("Deposit Succesfull. New balance is " + balance);
    }
}
