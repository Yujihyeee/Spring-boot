package com.example.demo.dog.controller;

import com.example.demo.dog.domain.DogDTO;

import java.util.Scanner;

public class DogController {
    Scanner scanner = new Scanner(System.in);
    DogDTO dog = new DogDTO();
    public void dog(){
        System.out.println("이름이 무엇입니까?");
        dog.setName(scanner.next());
        System.out.println("색깔은 무엇입니까?");
        dog.setColor(scanner.next());
        System.out.println("품종은 무엇입니까?");
        dog.setBreed(scanner.next());
        System.out.println("배고픕니까?");
        dog.setHungry(scanner.next());
        System.out.print(dog.toString());
    }
}
