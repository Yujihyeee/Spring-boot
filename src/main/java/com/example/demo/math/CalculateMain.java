package com.example.demo.math;

import java.util.Scanner;

public class CalculateMain {
    public static void main(String[] args) {
        System.out.println("숫자 1 ?");
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        System.out.println("숫자 2 ?");
        int num2 = scanner.nextInt();
        int num3 = num1 + num2;
        System.out.printf("%d + %d = %d", num1, num2, num3);




    };

}