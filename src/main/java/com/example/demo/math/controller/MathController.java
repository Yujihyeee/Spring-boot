package com.example.demo.math.controller;

import com.example.demo.math.domain.MathDTO;
import com.example.demo.math.service.MathServiceImpl;
import com.example.demo.math.service.MathService;
import com.example.demo.util.service.LambdaUtils;

import java.util.Scanner;

public class MathController extends LambdaUtils {
    private final MathService mathService;

    public MathController(){
        this.mathService = new MathServiceImpl();
    }

    public void main(){
        Scanner scanner = new Scanner(System.in);
        while (true){
            print.accept("\n[메뉴] 0.종료 1.계산기 2.수열 3.구구단\n");
            switch (scanner.next()){
                case "0" : return;
                case "1" : calculate(scanner);break;
                case "2" : sequence(scanner);break;
                case "3" : gugudan();break;
            }
        }
    }
    public void calculate(Scanner scanner) {
        MathDTO math = new MathDTO();
        print.accept("숫자 1 ?\n");
        math.setNum1(scanner.nextInt());
        print.accept("연산자\n");
        math.setOpcode(scanner.next());
        print.accept("숫자 2 ?\n");
        math.setNum2(scanner.nextInt());
        int result = 0;
        switch (math.getOpcode()) {
            case "+": result = mathService.add(math);break;
            case "-": result = mathService.subtract(math);break;
            case "*": result = mathService.multiple(math);break;
            case "/": result = mathService.divide(math);break;
            case "%": result = mathService.remain(math);break;
            }
            System.out.printf("\n%d %s %d = %d", math.getNum1(), math.getOpcode(), math.getNum2(), result);
        }
    public void sequence(Scanner scanner){
        MathDTO numbers = new MathDTO();
        print.accept("수열의 시작값\n");
        numbers.setNum1(scanner.nextInt());
        print.accept("수열의 마지막값\n");
        numbers.setNum2(scanner.nextInt());
        int [] arr = mathService.sequence(numbers);
        for(int i = 0; i < arr.length; i++){
            print.accept(arr[i] + "\t");
        }
    }
    public void gugudan(){
        for (int i = 1; i < 10; i++) {
            print.accept(i + "단" + '\t'+ '\t'+ '\t');
        }
        print.accept("\n");
        for (int i = 1; i < 10; i++) {
            for (int p = 1; p < 10; p++) {
                print.accept(p + " X " + i + " = " + i * p + '\t');
            }
            print.accept("\n");
        }
    }
}



