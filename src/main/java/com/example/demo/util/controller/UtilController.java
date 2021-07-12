package com.example.demo.util.controller;


import com.example.demo.util.domain.UtilDTO;
import com.example.demo.util.service.UtilService;
import com.example.demo.util.service.UtilServiceImpl;

import java.util.Scanner;

public class UtilController {

    private UtilService utilService;
    private UtilDTO util;
    private Scanner scanner;

    public UtilController(){
        this.utilService = new UtilServiceImpl();
        this.util = new UtilDTO();
        this.scanner = new Scanner(System.in);
    }

    public void todayAndCurrentTime(){
        System.out.println(utilService.todayAndCurrentTime());
    }

}
