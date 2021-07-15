package com.example.demo.bank.service;

import com.example.demo.bank.domain.AccountDTO;
import com.example.demo.util.service.LambdaUtils;
import com.example.demo.util.service.UtilService;
import com.example.demo.util.service.UtilServiceImpl;

import java.util.ArrayList;
import java.util.List;

public class BankServiceImpl extends LambdaUtils implements BankService {
    private final AccountDTO bankAccount;
    private final List<AccountDTO> bankAccounts;

    public BankServiceImpl(){
        bankAccount = new AccountDTO();
        bankAccounts = new ArrayList<>();
    }

    @Override
    public String count() {
        return string.apply(bankAccounts.size());
    }

    @Override
    public List<?> findAll() {
        return bankAccounts;
    }

    @Override
    public String[] findAllAccountNumbers() {
        int count = strToInt.apply(count());
        String [] accountsNumbers = new String[count];
        for(int i = 0; i < count; i++){
            accountsNumbers[i] = bankAccounts.get(i).getAccNumber();
        }
        return accountsNumbers;
    }

    @Override
    public void createAccount(AccountDTO bank) {
        UtilService utilService = new UtilServiceImpl();
        String first = utilService.randomNumbers(4, false);
        String accountNumber = utilService.randomNumbers(4, false) + "-"+
                utilService.randomNumbers(4, true)+"-"+
                utilService.randomNumbers(4, true);
        bank.setAccNumber(accountNumber);
        bankAccounts.add(bank);
    }

    @Override
    public String findBalance(AccountDTO bank) {
        return bankAccount.getMoney();
    }

    @Override
    public String deposit(AccountDTO bank) {
        int balance = strToInt.apply(bankAccount.getBalance());
        bankAccount.setMoney(balance + bank.getMoney());
        return bankAccount.getMoney();
    }

    @Override
    public String withdraw(AccountDTO bank) {
        return bankAccount.getMoney();
    }

    @Override
    public void dropAccount(AccountDTO bank) {

    }
}
