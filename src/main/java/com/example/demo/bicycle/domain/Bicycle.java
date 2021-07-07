package com.example.demo.bicycle.domain;



public class Bicycle{
    private int gear;
    private String company;
    private int speed;

    public void setGear(int gear){
        this.gear = gear;
    }
    public int getGear(){
        return this.gear;
    }
    public void setCompany(String company){
        this.company = company;
    }
    public String getCompany(){
        return this.company;
    }
    public void setSpeed(int speed){
        this.speed = speed;
    }
    public int getSpeed(){
        return this.speed;
    }

    @Override
    public String toString() {
        return String.format("기어는 %d, 제조사는 %s, 속도는 %d 입니다.",
        getGear(), getCompany(), getSpeed());
    }
}
