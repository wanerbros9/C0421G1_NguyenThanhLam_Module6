package com.codegym.model.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;

@Entity
public class CarRegister {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private int carNumber;
    private String departure;
    private String arrive;
    private String phone;
    private String email;
    private String departureHour;
    private String arriveHour;

    @ManyToOne(targetEntity = CarStation.class)
    @JoinColumn(name = "car_station_id", referencedColumnName = "id")
    private CarStation carStation;

    @ManyToOne(targetEntity = CarType.class)
    @JoinColumn(name = "car_type_id", referencedColumnName = "id")
    private CarType carType;

    public CarRegister() {
    }

    public CarRegister(int id, int carNumber, String departure, String arrive, String phone, String email, String departureHour, String arriveHour, CarStation carStation, CarType carType) {
        this.id = id;
        this.carNumber = carNumber;
        this.departure = departure;
        this.arrive = arrive;
        this.phone = phone;
        this.email = email;
        this.departureHour = departureHour;
        this.arriveHour = arriveHour;
        this.carStation = carStation;
        this.carType = carType;
    }

    public CarRegister(int carNumber, String departure, String arrive, String phone, String email, String departureHour, String arriveHour, CarStation carStation, CarType carType) {
        this.carNumber = carNumber;
        this.departure = departure;
        this.arrive = arrive;
        this.phone = phone;
        this.email = email;
        this.departureHour = departureHour;
        this.arriveHour = arriveHour;
        this.carStation = carStation;
        this.carType = carType;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCarNumber() {
        return carNumber;
    }

    public void setCarNumber(int carNumber) {
        this.carNumber = carNumber;
    }

    public String getDeparture() {
        return departure;
    }

    public void setDeparture(String departure) {
        this.departure = departure;
    }

    public String getArrive() {
        return arrive;
    }

    public void setArrive(String arrive) {
        this.arrive = arrive;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDepartureHour() {
        return departureHour;
    }

    public void setDepartureHour(String departureHour) {
        this.departureHour = departureHour;
    }

    public String getArriveHour() {
        return arriveHour;
    }

    public void setArriveHour(String arriveHour) {
        this.arriveHour = arriveHour;
    }

    public CarStation getCarStation() {
        return carStation;
    }

    public void setCarStation(CarStation carStation) {
        this.carStation = carStation;
    }

    public CarType getCarType() {
        return carType;
    }

    public void setCarType(CarType carType) {
        this.carType = carType;
    }
}
