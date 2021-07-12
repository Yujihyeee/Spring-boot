package com.example.demo.util.service;

import java.time.LocalDate;
import java.time.LocalTime;

public interface UtilService {
    LocalDate today();
    LocalTime currentTime();
    String todayAndCurrentTime();

}
