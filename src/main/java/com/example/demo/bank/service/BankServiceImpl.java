package com.example.demo.bank.service;

import com.example.demo.bank.domain.AccountDTO;
import com.example.demo.util.controller.UtilController;
import com.example.demo.util.service.LambdaUtils;
import com.example.demo.util.service.UtilService;
import com.example.demo.util.service.UtilServiceImpl;

import java.util.ArrayList;
import java.util.List;

public class BankServiceImpl extends LambdaUtils implements BankService {
    private final List<AccountDTO> accounts;

    @Override
    public String count() {
        return string.apply(accounts.size());
    }

    @Override
    public List<? extends AccountDTO> findAll() {
        return accounts;
    }

    public BankServiceImpl(){
        accounts = new ArrayList<>();
    }
    @Override
    public void createAccount(AccountDTO account) {
        UtilService utilService = new UtilServiceImpl();
        String accountNumber = utilService.randomNumbers(4, false) + "-" +
                utilService.randomNumbers(4, true)+ "-" +
                utilService.randomNumbers(4, true);
        account.setAccountNumber(accountNumber);
        accounts.add(account);
    }

    @Override
    public String[] findAllAccountNumbers() {
        int count = strToInt.apply(count());
        String [] accountNumbers = new String[count];
        for(int i = 0; i<count; i++){
            accountNumbers[i] = accounts.get(i).getAccountNumber();
        }
        return accountNumbers;
    }

    @Override
    public AccountDTO findAccountByAccountNumber(String accountNumber) {
        AccountDTO account = null;
        for(AccountDTO a: accounts){
            if(a.getAccountNumber().equals(accountNumber)){
                account = a;
                break;
            }
        }
        return account;
    }

    @Override
    public String findBalanceByAccountNumber(String accountNumber) {
        String balance ="";
        for(AccountDTO a :accounts){
            balance = a.getAccountNumber().equals(accountNumber)? a.getBalance(): "0";
            break;
        }
        return balance;
    }

    @Override
    public AccountDTO deposit(AccountDTO param) {
        AccountDTO account = findAccountByAccountNumber((param.getAccountNumber()));
        int restMoney = strToInt.apply(account.getMoney());
        account.setMoney(restMoney + param.getMoney());
        for(AccountDTO a: accounts){
            if(a.getAccountNumber().equals(account.getAccountNumber())){
                a.setBalance(account.getMoney());
                account = a;
            }
        }
        return account;
    }

    @Override
    public String withdraw(AccountDTO bank) {
        return "";
    }

    @Override
    public void dropAccount(AccountDTO bank) {

    }
}
