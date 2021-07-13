package com.example.demo.dog.domain;

import lombok.Data;

@Data
public class DogDTO {
    private String name;
    private String color;
    private String breed;

    @Override
    public String toString() {
        return String.format("이름은 %s, 색깔은 %s, 견종은 %s 입니다.", name, color, breed );
    }
}