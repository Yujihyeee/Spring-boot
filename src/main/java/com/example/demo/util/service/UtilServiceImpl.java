package com.example.demo.util.service;

import com.example.demo.util.domain.UtilDTO;

import java.time.LocalDate;
import java.time.LocalTime;

public class UtilServiceImpl implements UtilService{

    @Override
    public String randomNumbers(int digits, boolean allowZeroValue) {
        String first = "", result = "";
        first += allowZeroValue ? ((int)(Math.random() * 10)) : ((int)(Math.random() * 9 + 1));
        for(int i = 0; i < digits-1; i++){
            result += (int)(Math.random() * 10);
        }
        return first+result;
    }

    private UtilDTO util;

    public UtilServiceImpl(){
        this.util = new UtilDTO();
    }

    @Override
    public String todayAndCurrentTime() {
        return String.format("%s %s", today(), currentTime()) ;
    }

    @Override
    public LocalDate today() {
        util.setToday(LocalDate.now());
        return util.getToday();
    }

    @Override
    public LocalTime currentTime() {
        util.setCurrentTime(LocalTime.now());
        return util.getCurrentTime();
    }
}
