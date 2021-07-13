package com.example.demo.bicycle.controller;

import com.example.demo.bicycle.domain.BicycleDTO;
import com.example.demo.bicycle.service.BicycleService;
import com.example.demo.bicycle.service.BicycleServiceImpl;
import org.springframework.stereotype.Controller;

import java.util.List;
import java.util.Scanner;
@Controller
public class BicycleController {

    private BicycleService bicycleService;

    public BicycleController(){
        this.bicycleService = new BicycleServiceImpl();
    }

    public void add(BicycleDTO bicycle) {
        bicycleService.add(bicycle);
    }

    public void show() {
        System.out.println("자전거 갯수:" + bicycleService.count());
        System.out.println(bicycleService.show());
    }

    public int changingGear(int changeGear) {
        return bicycleService.changingGear(changeGear);
    }

    public String  changingPedalCadence(String changePedalCadence) {
        return bicycleService.changingPedalCadence(changePedalCadence);
    }

    public int applyingBrakes(int applyBrakes) {
        return bicycleService.applyingBrakes(applyBrakes);
    }
}
