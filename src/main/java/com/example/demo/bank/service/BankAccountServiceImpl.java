package com.example.demo.bank.service;

import com.example.demo.bank.domain.BankAccountDTO;
import com.example.demo.util.service.UtilService;
import com.example.demo.util.service.UtilServiceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class BankAccountServiceImpl implements BankAccountService{
    private BankAccountDTO bankAccount;
    private List<BankAccountDTO> bankAccounts;

    public BankAccountServiceImpl(){
        bankAccount = new BankAccountDTO();
        bankAccounts = new ArrayList<>();
    }

    @Override
    public int count() {
        return bankAccounts.size();
    }

    @Override
    public List<?> findAll() {
        return bankAccounts;
    }

    @Override
    public String[] findAllAccountNumbers() {
        String [] accountsNumbers = new String[count()];
        for(int i = 0; i < count(); i++){
            accountsNumbers[i] = bankAccounts.get(i).getAccNumber();
        }
        return accountsNumbers;
    }

    @Override
    public void createAccount(BankAccountDTO bank) {
        UtilService utilService = new UtilServiceImpl();
        String first = utilService.randomNumbers(4, false);
        String accountNumber = utilService.randomNumbers(4, false) + "-"+
                utilService.randomNumbers(4, true)+"-"+
                utilService.randomNumbers(4, true);
        bank.setAccNumber(accountNumber);
        bankAccounts.add(bank);
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
    public void dropAccount(BankAccountDTO bank) {

    }
}
