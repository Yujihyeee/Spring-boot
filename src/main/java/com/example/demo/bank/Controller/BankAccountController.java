package com.example.demo.bank.Controller;

import com.example.demo.bank.domain.BankAccountDTO;
import com.example.demo.bank.service.BankAccountService;
import com.example.demo.bank.service.BankAccountServiceImpl;
import org.springframework.stereotype.Controller;

import java.util.List;
import java.util.Scanner;
@Controller
public class BankAccountController {
    private BankAccountService bankAccountService;

    public BankAccountController() {
        bankAccountService = new BankAccountServiceImpl();
    }

    public void add(BankAccountDTO bankAccount) {
        bankAccountService.add(bankAccount);
    }

    public void show() {
        System.out.println("계좌 개수 :" + bankAccountService.count());
        System.out.println(bankAccountService.show());
    }

}
