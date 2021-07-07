package com.example.demo.practice;

public class BankAccount {
    private int balance = 0;
    private int deposit;
    private int withdraw;
    private int checkMyBalance;

    public void setBalance(int balance){
        this.balance = balance;
    }
    public int getBalance(){
        return this.balance;
    }
    public void setDeposit(int deposit){
        this.deposit = deposit;
    }
    public int getDeposit(){
        return this.deposit;
    }
    public void setWithdraw(int withdraw){
        this.withdraw = withdraw;
    }
    public int getWithdraw(){
        return this.withdraw;
    }
    public void setCheckMyBalance(int checkMyBalance){
        this.checkMyBalance = checkMyBalance;
    }
    public int getCheckMyBalance(){
        return this.checkMyBalance;
    }
}
