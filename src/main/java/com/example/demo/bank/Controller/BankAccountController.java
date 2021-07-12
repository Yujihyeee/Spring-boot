package com.example.demo.bank.Controller;

import com.example.demo.bank.domain.BankAccountDTO;
import com.example.demo.bank.service.BankAccountService;
import com.example.demo.bank.service.BankAccountServiceImpl;

import java.util.Scanner;

public class BankAccountController {
    private BankAccountService bankAccountService;
    private BankAccountDTO bankAccount;
    private Scanner scanner;

    public BankAccountController() {
        this.bankAccountService = new BankAccountServiceImpl();
        this.bankAccount = new BankAccountDTO();
        this.scanner = new Scanner(System.in);

    }
    public void BankAccountController02(){
        System.out.println("계좌를 생성하시려면 이름을 입력하세요");
        bankAccount.setName(scanner.next());
        bankAccount.setAccNumber(scanner.next());
        System.out.println("계좌가 생성되었습니다.");
        System.out.println("얼마를 입금하시겠습니까?");
        bankAccount.setMoney(scanner.nextInt());
        System.out.printf("잔액은 %d원 입니다.", bankAccount.getMoney()+bankAccount.getBalance());
        System.out.println();
        System.out.println("얼마를 출금하시겠습니까?");
        bankAccount.setMoney(scanner.nextInt());
        System.out.println("잔액을 확인하시겠습니까?");
        bankAccount.setMoney(scanner.nextInt());
        System.out.println(bankAccount.getBalance());

    }
}
