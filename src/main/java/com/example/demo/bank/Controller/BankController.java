package com.example.demo.bank.Controller;

import com.example.demo.bank.domain.AccountDTO;
import com.example.demo.bank.service.BankService;
import com.example.demo.bank.service.BankServiceImpl;
import com.example.demo.util.service.LambdaUtils;
import org.springframework.stereotype.Controller;

import java.util.Scanner;

@Controller
public class BankController extends LambdaUtils {
    private BankService bankService;

    public BankController() {
        bankService = new BankServiceImpl();
    }
    public void main() {
        Scanner scanner = new Scanner(System.in);
        AccountDTO account = null;
        while (true){
            print.accept("\n[메뉴]0.종료 1.계좌개설 2.계좌목록 3.계좌번호목록 4.입금\n");
            switch (scanner.next()){
                case "0" : return;
                case "1" :
                    account = new AccountDTO();
                    print.accept("\n이름:[ ]\n");
                    account.setName(scanner.next());
                    bankService.createAccount(account);
                    break;
                case "2" :
                    print.accept("\n개설된 계좌 수: " + bankService.count());
                    print.accept("\nbankAccountService.findAll()");
                    break;
                case "3" :
                    for(String s: bankService.findAllAccountNumbers()){
                        print.accept(s + "\n");
                    }
                    break;
                case "4" :
                    print.accept("\n계좌번호: []");
                    account = new AccountDTO();
                    account.setAccNumber(scanner.next());
                    print.accept("\n입금액:[]");
                    account.setMoney(scanner.next());
                    break;
                case "5" :
                case "6" :
            }
        }
    }
}
