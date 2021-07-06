package com.example.demo;

public class plus {
    public static void main(String[] args) {
        int i = 0;

        int sum = 0;

        while (i <= 100) {
            sum += i;

            i++;
        }
            System.out.println("1~100까지의 합은" + sum + "입니다.");

    }
}