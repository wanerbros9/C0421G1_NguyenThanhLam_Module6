package com.codegym.dto;

import com.codegym.model.entity.CarStation;
import com.codegym.model.entity.CarType;

import javax.persistence.*;

public class CarRegisterDto {

    private int id;

    private int carNumber;
    private String departure;
    private String arrive;
    private String phone;
    private String email;
    private String departureHour;
    private String arriveHour;

    private CarStation carStation;

    private CarType carType;
}
