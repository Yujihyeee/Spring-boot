package com.example.demo.common.controller;

import com.example.demo.bank.Controller.BankAccountController;
import com.example.demo.bank.domain.BankAccountDTO;
import com.example.demo.bank.service.BankAccountService;
import com.example.demo.bicycle.controller.BicycleController;
import com.example.demo.bicycle.domain.BicycleDTO;
import com.example.demo.bicycle.service.BicycleService;
import com.example.demo.dog.controller.DogController;
import com.example.demo.dog.domain.DogDTO;
import com.example.demo.dog.service.DogService;
import com.example.demo.dog.service.DogServiceImpl;
import com.example.demo.math.controller.CalculatorController;
import com.example.demo.math.domain.CalculatorDTO;

import com.example.demo.util.controller.UtilController;

import java.util.Random;
import java.util.Scanner;

public class HomeController {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DogController dogController = new DogController();
        BankAccountController bankAccountController = new BankAccountController();
        BicycleController bicycleController = new BicycleController();
        Random random = new Random();

        while(true){
            System.out.println("\n[메뉴] 0.종료 1.계산기 2.수열 3.개 정보 33.개목록 4.자전거 정보 44.자전거목록 5.오늘 날짜 6.계좌정보 66.계좌목록");
            switch (scanner.next()){
                case "0" : return;
                case "1" : new CalculatorController().calculate();break;
                case "2" : new CalculatorController().sequence();break;
                case "3" :
                    DogDTO dog = new DogDTO();
                    System.out.println("이름이 무엇입니까?");
                    dog.setName(scanner.next());
                    System.out.println("색깔은 무엇입니까?");
                    dog.setColor(scanner.next());
                    System.out.println("품종은 무엇입니까?");
                    dog.setBreed(scanner.next());
                    dogController.add(dog);
                    break;
                case "33" :
                    dogController.show();
                    break;
                case "4" :
                    BicycleDTO bicycle = new BicycleDTO();
                    System.out.println("기어는 몇 단? ");
                    bicycle.setGear(scanner.nextInt());
                    System.out.println("제조사는 어디? ");
                    bicycle.setCompany(scanner.next());
                    System.out.println("속도는 얼마? ");
                    bicycle.setSpeed(scanner.nextInt());
                    bicycleController.add(bicycle);
                    break;
                case "44" :
                    bicycleController.show();
                    break;
                case "5" : new UtilController().todayAndCurrentTime();break;
                case "6" :
                    BankAccountDTO bankAccount= new BankAccountDTO();
                    System.out.println("계좌를 생성하시려면 이름을 입력하세요");
                    bankAccount.setName(scanner.next());
                    System.out.println("계좌번호 :" + random.nextInt(9999) + "-" + random.nextInt(9999) + "-" + random.nextInt(9999));
                    System.out.println("계좌가 생성되었습니다.");
                    System.out.println("얼마를 입금하시겠습니까?");
                    bankAccount.setMoney(scanner.nextInt());
                    System.out.printf("잔액은 %d원 입니다.", (bankAccount.getBalance())+ bankAccount.getMoney());
                    System.out.println("얼마를 출금하시겠습니까?");
                    bankAccount.setMoney(scanner.nextInt());
                    System.out.printf("잔액은 %d원 입니다.", (bankAccount.getBalance()) - bankAccount.getMoney());
                    bankAccountController.add(bankAccount);
                    break;
                case "66" :
                    bankAccountController.show();
                break;
            }
        }
    }
}
