package com.example.demo.practice;

public class Circle {
    final double P1 = 3.141592;
    double radius;

    public Circle(double redius){
        this.radius = redius;
    }

    public double area(Circle cir){
        double result = cir.radius * cir.radius * 3.14;
        return result;

    }
}