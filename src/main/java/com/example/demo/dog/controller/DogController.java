package com.example.demo.dog.controller;

import com.example.demo.dog.domain.DogDTO;
import com.example.demo.dog.service.DogService;
import com.example.demo.dog.service.DogServiceImpl;
import com.example.demo.util.service.LambdaUtils;
import org.springframework.stereotype.Controller;

import java.util.List;
import java.util.Scanner;

@Controller
public class DogController extends LambdaUtils {

    private DogService dogService;

    public DogController(){
        dogService = new DogServiceImpl();
    }
    public void main(){
        Scanner scanner = new Scanner(System.in);
        DogDTO dog = null;
        while (true){
            print.accept("\n[메뉴] 0.종료 1.추가 2.카운트 3.목록\n");
            switch (scanner.next()){
                case "0" : return;
                case "1" :
                    dog = new DogDTO();
                    print.accept("\n이름이 무엇입니까?\n");
                    dog.setName(scanner.next());
                    print.accept("\n색깔은 무엇입니까?\n");
                    dog.setColor(scanner.next());
                    print.accept("\n품종은 무엇입니까?\n");
                    dog.setBreed(scanner.next());
                    dogService.add(dog);break;
                case "2" : print.accept(string.apply(dogService.count()));break;
                case "3" :
                    List<DogDTO> list = (List<DogDTO>)dogService.show();
                    for(DogDTO d : list){
                        print.accept(dog.toString());
                    }
                    break;
                case "4" :
            }
        }
    }
    public void add(DogDTO dog){
        dogService.add(dog);
    }

    public void show(){
        print.accept("\n강아지 수 :\n" + dogService.count());
        print.accept("\ndogService.show()\n");
    }

    public String barking(String bark) {
        return dogService.barking(bark);
    }

    public String fetching(String target) {
        return dogService.fetching(target);
    }

    public String waggingTail() {
        return dogService.waggingTail();
    }
}
