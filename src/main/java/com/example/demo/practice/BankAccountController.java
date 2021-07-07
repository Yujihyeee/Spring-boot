package com.example.demo.practice;

import com.example.demo.practice.BankAccount;

import java.util.Scanner;


public class BankAccountController {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 두 개의 인스턴스 생성
        BankAccount yoon = new BankAccount();
        BankAccount park = new BankAccount();

        // 각 인스턴스를 대상으로 예금을 진행
        System.out.println("예금금액?");
        yoon.setDeposit(scanner.nextInt());
        park.setDeposit(scanner.nextInt());

        // 각 인스턴스를 대상으로 출금을 진행
        System.out.println("출금금액?");
        yoon.setWithdraw(scanner.nextInt());
        park.setWithdraw(scanner.nextInt());

        // 각 인스턴스를 대상으로 잔액을 조회
        System.out.println("잔액?");
        System.out.println(yoon.getCheckMyBalance());
        System.out.println(park.getCheckMyBalance());

    }
}
