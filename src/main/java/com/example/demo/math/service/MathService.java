package com.example.demo.math.service;
//add subtract multiple divide remain

import com.example.demo.math.domain.MathDTO;

public interface MathService {
    int add(MathDTO calculator);
    int subtract(MathDTO calculator);
    int multiple(MathDTO calculator);
    int divide(MathDTO calculator);
    int remain(MathDTO calculator);
    int[] sequence(MathDTO calculator);


}
