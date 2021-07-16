package com.example.demo.common.controller;

import com.example.demo.bank.Controller.BankController;
import com.example.demo.bicycle.controller.BicycleController;
import com.example.demo.dog.controller.DogController;
import com.example.demo.math.controller.MathController;
import com.example.demo.util.controller.UtilController;
import com.example.demo.himart.controller.HimartController;
import java.util.Scanner;

import static com.example.demo.util.service.LambdaUtils.print;

public class HomeController {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true){
            print.accept("\n[메뉴] 0.종료 1.유틸 2.수학 3.개 4.자전거 5.하이마트 6.은행\n");
            switch (scanner.next()){
                case "0" : return;
                case "1" : new UtilController().main();break;
                case "2" : new MathController().main();break;
                case "3" : new DogController().main();break;
                case "4" : new BicycleController().main();break;
                case "5" : new HimartController().main();break;
                case "6" : new BankController().main();break;
            }
        }
    }
}
