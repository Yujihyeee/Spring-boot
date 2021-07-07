package com.example.demo.bank.domain;



public class BankACCOUNT {
    private String accNumber;
    private String ssNumber;
    private int balance;

    public BankACCOUNT(String acc, String ss, int bal){
        accNumber = acc;
        ssNumber = ss;
        balance = bal;
    }
    public int deposit(int amount){
        balance += amount;
        return balance;
    }
    public int withdraw(int amount){
        balance -= amount;
        return balance;
    }
    public void setAccNumber(String accNumber){
        this.accNumber = accNumber;
    }
    public String getAccNumber(){
        return this.accNumber;
    }
    public void setSsNumber(String ssNumber){
        this.ssNumber = ssNumber;
    }
    public String getSsNumber(){
        return this.ssNumber;
    }
    public void setBalance(int balance){
        this.balance = balance;
    }
    public int getBalance(){
        return this.balance;
    }
    public int checkMyBalance(){
        System.out.println("계좌번호: " + accNumber);
        System.out.println("주민번호: " + ssNumber);
        System.out.println("잔   액: " + balance + '\n');
        return balance;
    }
}
