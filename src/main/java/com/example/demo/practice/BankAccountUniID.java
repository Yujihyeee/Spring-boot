package com.example.demo.practice;

class BankAccountUniID {
    public static void main(String[] args) {
        BankAccount1 yoon = new BankAccount1();
        yoon.initAccount("12-34-89", "990990-9090900", 10000);

        BankAccount1 park = new BankAccount1();
        park.initAccount("33-55-09", "770088-5959007", 10000);

        yoon.deposit(5000);
        park.deposit(3000);
        yoon.withdraw(2000);
        park.withdraw(2000);
        yoon.checkMyBalance();
        park.checkMyBalance();
    }
}