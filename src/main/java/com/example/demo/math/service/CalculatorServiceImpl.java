package com.example.demo.math.service;

import com.example.demo.math.domain.CalculatorDTO;

public class CalculatorServiceImpl implements CalculatorService {


    @Override
    public int add(CalculatorDTO calculator) {
        return calculator.getNum1() + calculator.getNum2();
    }

    @Override
    public int subtract(CalculatorDTO calculator) {
        return calculator.getNum1() - calculator.getNum2();
    }

    @Override
    public int multiple(CalculatorDTO calculator) {
        return calculator.getNum1() * calculator.getNum2();
    }

    @Override
    public int divide(CalculatorDTO calculator) {
        return calculator.getNum1() / calculator.getNum2();
    }

    @Override
    public int remain(CalculatorDTO calculator) {
        return calculator.getNum1() % calculator.getNum2();
    }


    @Override
    public int[] sequence(CalculatorDTO calculator) {
        int count = calculator.getNum2() - calculator.getNum1() + 1;
        int[] arr = new int[count];
        int i = 0;
        for (int j = calculator.getNum1(); j <= calculator.getNum2(); j++){
            arr[i] = j;
            i++;
        }
        return arr;
    }

}




