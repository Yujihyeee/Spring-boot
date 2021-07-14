package com.example.demo.util.controller;


import com.example.demo.util.domain.UtilDTO;
import com.example.demo.util.service.UtilService;
import com.example.demo.util.service.UtilServiceImpl;

import java.util.Scanner;

public class UtilController {
    private UtilService utilService = new UtilServiceImpl();

    public void todayAndCurrentTime(){
        System.out.println(utilService.todayAndCurrentTime());
    }

}
