package com.example.demo.math.service;

import com.example.demo.math.domain.MathDTO;

public class MathServiceImpl implements MathService {


    @Override
    public int add(MathDTO calculator) {
        return calculator.getNum1() + calculator.getNum2();
    }

    @Override
    public int subtract(MathDTO calculator) {
        return calculator.getNum1() - calculator.getNum2();
    }

    @Override
    public int multiple(MathDTO calculator) {
        return calculator.getNum1() * calculator.getNum2();
    }

    @Override
    public int divide(MathDTO calculator) {
        return calculator.getNum1() / calculator.getNum2();
    }

    @Override
    public int remain(MathDTO calculator) {
        return calculator.getNum1() % calculator.getNum2();
    }


    @Override
    public int[] sequence(MathDTO calculator) {
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




