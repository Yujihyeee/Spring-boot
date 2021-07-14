package com.example.demo.bicycle.service;

import com.example.demo.bicycle.domain.BicycleDTO;
import com.example.demo.dog.domain.DogDTO;
import com.example.demo.dog.service.DogService;

import java.util.ArrayList;
import java.util.List;

public class BicycleServiceImpl implements BicycleService{

    private BicycleDTO bicycle;
    private List<BicycleDTO> bicycles;

    public BicycleServiceImpl(){
        bicycle = new BicycleDTO();
        bicycles = new ArrayList<>();
    }

    @Override
    public void add(BicycleDTO bicycle) {
        bicycles.add(bicycle);
    }

    @Override
    public int count() {
        return bicycles.size();
    }

    @Override
    public List<BicycleDTO> show() {
        return bicycles;
    }

    @Override
    public void changingGear() {

    }

    @Override
    public void changingPedalCadence() {

    }

    @Override
    public void applyingBrakes() {

    }


}
