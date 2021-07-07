package com.example.demo.dog;

//state(name, color, breed, hungry) and behavior (barking, fetching, wagging tail)
import java.util.Scanner;

class Dog{
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

public class DogMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Dog dog = new Dog();
        System.out.println("이름?");
        dog.setName(scanner.next());
        System.out.println("색깔은?");
        dog.setColor(scanner.next());
        System.out.println("견종은?");
        dog.setBreed(scanner.next());
        System.out.println("배고픈가?");
        dog.setHungry(scanner.next());
        System.out.print(dog.toString());
    }
}
