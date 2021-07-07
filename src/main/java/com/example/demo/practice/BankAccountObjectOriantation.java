package com.example.demo.practice;

public class BankAccountObjectOriantation {
    public static void main(String[] args) {
        // 두 개의인스턴스 생성
        BankAccount1 yoon = new BankAccount1();
        BankAccount1 park = new BankAccount1();

        // 각 인스턴스를 대상으로 예금을 진행
        yoon.deposit(5000);
        park.deposit(3000);

        // 각 인스턴스를 대상으로 출금을 진행
        yoon.deposit(2000);
        park.deposit(2000);

        // 각 인스턴스를 대상으로 잔액을 조회
        yoon.checkMyBalance();
        park.checkMyBalance();
    }
}

