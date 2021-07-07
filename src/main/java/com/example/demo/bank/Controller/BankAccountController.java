package com.example.demo.bank.Controller;

import com.example.demo.bank.domain.BankAccount;

public class BankAccountController {
    public static void main(String[] args) {
        // 두 개의인스턴스 생성
        BankAccount yoon = new BankAccount();
        BankAccount park = new BankAccount();

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
