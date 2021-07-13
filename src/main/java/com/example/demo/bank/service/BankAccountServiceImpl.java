package com.example.demo.bank.service;

import com.example.demo.bank.domain.BankAccountDTO;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class BankAccountServiceImpl implements BankAccountService{
    private BankAccountDTO bankAccount;
    private ArrayList<BankAccountDTO> bankAccounts;

    public BankAccountServiceImpl(){
        bankAccount = new BankAccountDTO();
        bankAccounts = new ArrayList<>();
    }
    @Override
    public void add(BankAccountDTO bankAccount) {
        bankAccounts.add(bankAccount);
    }

    @Override
    public int count() {
        return bankAccounts.size();
    }

    @Override
    public List<BankAccountDTO> show() {
        return bankAccounts;
    }

    @Override
    public void createAccount(BankAccountDTO bank) {
        Random random = new Random();
        String randomNumber = "****-****-****";
        this.bankAccount = new BankAccountDTO();
        bankAccount.setAccNumber(randomNumber);
        bankAccount.setName(bank.getName());
    }

    @Override
    public int findBalance(BankAccountDTO bank) {
        return bankAccount.getMoney();
    }

    @Override
    public int deposit(BankAccountDTO bank) {
        int balance = bankAccount.getBalance();
        bankAccount.setMoney(balance + bank.getMoney());
        return balance;
    }

    @Override
    public int withdraw(BankAccountDTO bank) {
        int balance = bankAccount.getBalance() + bankAccount.getMoney();
        bankAccount.setMoney(balance - bank.getMoney());
        return bankAccount.getMoney();
    }

    @Override
    public int balance(BankAccountDTO bank) {
        return bankAccount.getBalance() + bankAccount.getMoney();
    }

    @Override
    public void dropAccount(BankAccountDTO bank) {
        return;
    }


}
