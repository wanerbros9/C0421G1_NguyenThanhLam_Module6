package com.codegym.model.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.Set;

@Entity
public class CarStation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String carStationName;

    @JsonBackReference
    @OneToMany(mappedBy = "carStation", cascade = {CascadeType.ALL})
    private Set<CarRegister> carRegisterSet;

    public CarStation() {
    }

    public CarStation(int id, String carStationName, Set<CarRegister> carRegisterSet) {
        this.id = id;
        this.carStationName = carStationName;
        this.carRegisterSet = carRegisterSet;
    }

    public CarStation(String carStationName, Set<CarRegister> carRegisterSet) {
        this.carStationName = carStationName;
        this.carRegisterSet = carRegisterSet;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCarStationName() {
        return carStationName;
    }

    public void setCarStationName(String carStationName) {
        this.carStationName = carStationName;
    }

    public Set<CarRegister> getCarRegisterSet() {
        return carRegisterSet;
    }

    public void setCarRegisterSet(Set<CarRegister> carRegisterSet) {
        this.carRegisterSet = carRegisterSet;
    }
}
