package com.example.demo.common.controller;

import com.example.demo.bank.Controller.BankAccountController;
import com.example.demo.bicycle.controller.BicycleController;
import com.example.demo.dog.controller.DogController;
import com.example.demo.dog.domain.DogDTO;
import com.example.demo.math.controller.CalculatorController;
import com.example.demo.util.controller.UtilController;
import java.util.Scanner;

public class HomeController {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DogController dogController = new DogController();
        BankAccountController bankAccountController = new BankAccountController();
        BicycleController bicycleController = new BicycleController();

        while(true){
            System.out.println("\n[메뉴] 0.종료 1.계산기 2.수열 3.개 정보 4.자전거 정보 5.오늘 날짜 6.계좌정보");
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
                case "4" :bicycleController.main();break;
                case "5" : new UtilController().todayAndCurrentTime();break;
                case "6" : bankAccountController.main();break;
            }
        }
    }
}
