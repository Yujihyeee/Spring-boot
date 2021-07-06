package com.example.demo;

public class BankAccount1 {
    String accNumber;
    String ssNumber;
    int balance;

    public BankAccount1(String acc, String ss, int bal){
        accNumber = acc;
        ssNumber = ss;
        balance = bal;
    }
    public int deposit(int amount) {
        balance += amount;
        return balance;
    }
    public int withdraw(int amount) {
        balance -= amount;
        return balance;
    }
    public int checkMyBalance() {
        System.out.println("계좌번호: " + accNumber);
        System.out.println("주민번호: " + ssNumber);
        System.out.println("잔   액:" + balance + '\n');
        return balance;
    }
}
