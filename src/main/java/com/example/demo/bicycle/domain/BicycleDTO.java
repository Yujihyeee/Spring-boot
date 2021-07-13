package com.example.demo.bicycle.domain;


import lombok.Data;

@Data
public class BicycleDTO {
    private int gear;
    private String company;
    private int speed;

    @Override
    public String toString() {
        return String.format("기어는 %d, 제조사는 %s, 속도는 %d 입니다.", gear, company, speed);
    }
}
