package com.example.demo.math;

public class gugudan {
    public static void main(String[] args) {

        for (int i = 1; i < 10; i++) {
            System.out.print(i + "단" + '\t'+ '\t'+ '\t');
        }
        System.out.println();
        for (int i = 1; i < 10; i++) {
            for (int p = 1; p < 10; p++) {
                System.out.print(p + " X " + i + " = " + i * p + '\t');
            }
            System.out.println();
        }
    }
}