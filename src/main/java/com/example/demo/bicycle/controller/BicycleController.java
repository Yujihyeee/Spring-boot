package com.example.demo.bicycle.controller;

import com.example.demo.bicycle.domain.BicycleDTO;

import java.util.Scanner;

public class BicycleController {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BicycleDTO bicycle = new BicycleDTO();
        System.out.println("기어는 몇 단? ");
        bicycle.setGear(scanner.nextInt());
        System.out.println("제조사는 어디? ");
        bicycle.setCompany(scanner.next());
        System.out.println("속도는 얼마? ");
        bicycle.setSpeed(scanner.nextInt());
        System.out.print(bicycle.toString());

    }
}
