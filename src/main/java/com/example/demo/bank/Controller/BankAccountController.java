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
    public void main() {
        Scanner scanner = new Scanner(System.in);
        BankAccountDTO account = null;
        while (true){
            System.out.println("\n[메뉴]0.종료 1.계좌개설 2.계좌목록");
            switch (scanner.next()){
                case "0" : return;
                case "1" :
                    account = new BankAccountDTO();
                    System.out.println("이름:[ ]");
                    account.setName(scanner.next());
                    bankAccountService.createAccount(account);
                    break;
                case "2" :
                    System.out.println("개설된 계좌 수: " + bankAccountService.count());
                    System.out.println(bankAccountService.findAll());
                    break;
                case "3" :
                case "4" :
                case "5" :
                case "6" :
            }
        }
    }
}
