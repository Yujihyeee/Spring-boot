package com.example.demo.math.controller;

import com.example.demo.math.domain.Calculator;

import java.util.Scanner;

public class CalculatorController {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();
        System.out.println("숫자 1 ?");
        calculator.setNum1(scanner.nextInt());
        System.out.println("연산자");
        calculator.setOpcode("+");
        System.out.println("숫자 2 ?");
        calculator.setNum2(scanner.nextInt());
        String opcode = "num1" + "num2";
        System.out.print(calculator.toString());

    };

}