package com.example.demo.math.controller;

import com.example.demo.math.domain.CalculatorDTO;
import com.example.demo.math.service.CalculatorServiceImpl;
import com.example.demo.math.service.CalculatorService;

import java.util.Scanner;

public class CalculatorController {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CalculatorDTO calculator = new CalculatorDTO();
        CalculatorService calculatorService = new CalculatorServiceImpl();
        System.out.println("숫자 1 ?");
        calculator.setNum1(scanner.nextInt());
        System.out.println("연산자");
        calculator.setOpcode(scanner.next());
        System.out.println("숫자 2 ?");
        calculator.setNum2(scanner.nextInt());
        int result = 0;
        switch (calculator.getOpcode()){
            case "+" : result = calculatorService.add(calculator);
            break;
            case "-" : result = calculatorService.subtract(calculator);
            break;
            case "*" : result = calculatorService.multiple(calculator);
            break;
            case "/" : result = calculatorService.divide(calculator);
            break;
            case "%" : result = calculatorService.remain(calculator);
            break;

        }
        System.out.printf("%d %s %d = %d",
                calculator.getNum1(),
                calculator.getOpcode(),
                calculator.getNum2(),
                result);

    }

}