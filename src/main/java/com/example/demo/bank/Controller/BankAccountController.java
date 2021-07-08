package com.example.demo.bank.Controller;

import com.example.demo.bank.domain.BankAccountDTO;

import java.util.Scanner;

public class BankAccountController {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BankAccountDTO yoon = new BankAccountDTO("12-34-89", "990990-9090990", 10000);
        BankAccountDTO park = new BankAccountDTO("33-55-09", "770088-5959007", 10000);
        yoon.deposit(5000);
        park.deposit(3000);
        yoon.withdraw(2000);
        park.withdraw(2000);
        System.out.printf("yoon 님의 계좌번호는 %s, 주민번호는 %s, 잔액은 %d 원 입니다.",
                yoon.getAccNumber(), yoon.getSsNumber(),yoon.getBalance());
        System.out.println();
        System.out.printf("park 님의 계좌번호는 %s, 주민번호는 %s, 잔액은 %d 원 입니다.",
                park.getAccNumber(), park.getSsNumber(),park.getBalance());

    }
}
