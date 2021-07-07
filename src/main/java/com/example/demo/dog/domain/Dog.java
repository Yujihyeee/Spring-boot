package com.example.demo.dog.domain;


public class Dog{
    private String name;
    private String color;
    private String breed;
    private String hungry;

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setColor(String color){
        this.color = color;
    }
    public String getColor(){
        return color;
    }
    public void setBreed(String breed){
        this.breed = breed;
    }
    public String getBreed(){
        return breed;
    }
    public void setHungry(String hungry){
        this.hungry = hungry;
    }
    public String getHungry(){
        return hungry;
    }

    @Override
    public String toString() {
        return String.format("이름은 %s, 색깔은 %s, 견종은 %s, 배고픔은 %s 입니다.", getName(), getColor(), getBreed(), getHungry());
    }
}