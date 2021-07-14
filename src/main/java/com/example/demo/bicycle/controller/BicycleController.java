package com.example.demo.bicycle.controller;

import com.example.demo.bank.domain.BankAccountDTO;
import com.example.demo.bicycle.domain.BicycleDTO;
import com.example.demo.bicycle.service.BicycleService;
import com.example.demo.bicycle.service.BicycleServiceImpl;
import org.springframework.stereotype.Controller;

import java.util.List;
import java.util.Scanner;
@Controller
public class BicycleController {

    private BicycleService bicycleService;
    private BicycleDTO bicycle;
    private Scanner scanner ;

    public BicycleController(){
        this.bicycleService = new BicycleServiceImpl();
        this.bicycle = new BicycleDTO();
        this.scanner = new Scanner(System.in);
    }

    public void main() {
        BicycleDTO bicycle = new BicycleDTO();
        System.out.println("기어는 몇 단? ");
        bicycle.setGear(scanner.nextInt());
        System.out.println("제조사는 어디? ");
        bicycle.setCompany(scanner.next());
        System.out.println("속도는 얼마? ");
        bicycle.setSpeed(scanner.nextInt());
        System.out.println(bicycle.toString());
    }
}
