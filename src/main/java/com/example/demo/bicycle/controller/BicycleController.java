package com.example.demo.bicycle.controller;

import com.example.demo.bicycle.domain.BicycleDTO;
import com.example.demo.bicycle.service.BicycleService;
import com.example.demo.bicycle.service.BicycleServiceImpl;
import com.example.demo.util.service.LambdaUtils;
import org.springframework.stereotype.Controller;

import java.util.Scanner;
@Controller
public class BicycleController extends LambdaUtils {

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
        print.accept("\n기어는 몇 단? \n");
        bicycle.setGear(scanner.nextInt());
        print.accept("\n제조사는 어디? \n");
        bicycle.setCompany(scanner.next());
        print.accept("\n속도는 얼마? \n");
        bicycle.setSpeed(scanner.nextInt());
        print.accept(bicycle.toString());
    }
}
