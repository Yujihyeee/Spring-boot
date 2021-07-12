package com.example.demo.bank.service;

import com.example.demo.bank.Controller.BankAccountController;
import com.example.demo.bank.domain.BankAccountDTO;

import java.util.Random;

public class BankAccountServiceImpl implements BankAccountService{
    private BankAccountDTO bankAccount;


    @Override
    public void createAccount(BankAccountDTO bank) {
        this.bankAccount = new BankAccountDTO();
        String randomNumber = "";
        bankAccount.setAccNumber(randomNumber);
        bankAccount.setName(bank.getName());
    }

    @Override
    public int findBalance(BankAccountDTO bank) {
        return bankAccount.getMoney();
    }

    @Override
    public int balance(BankAccountDTO bank) {
        return bankAccount.getBalance();
    }

    @Override
    public int deposit(BankAccountDTO bank) {
        int balance = bankAccount.getMoney();
        bankAccount.setMoney(balance + bank.getMoney());
        return bankAccount.getMoney();
    }

    @Override
    public int withdraw(BankAccountDTO bank) {
        return 0;
    }

    @Override
    public void dropAccount(BankAccountDTO bank) {
    }
}
