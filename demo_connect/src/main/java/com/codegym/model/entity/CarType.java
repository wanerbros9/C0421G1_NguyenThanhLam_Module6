package com.codegym.model.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.Set;

@Entity
public class CarType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String carTypeName;

    @JsonBackReference
    @OneToMany(mappedBy = "carType", cascade = CascadeType.ALL)
    private Set<CarRegister> carRegisterSet;

    public CarType() {
    }

    public CarType(int id, String carTypeName, Set<CarRegister> carRegisterSet) {
        this.id = id;
        this.carTypeName = carTypeName;
        this.carRegisterSet = carRegisterSet;
    }

    public CarType(String carTypeName, Set<CarRegister> carRegisterSet) {
        this.carTypeName = carTypeName;
        this.carRegisterSet = carRegisterSet;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCarTypeName() {
        return carTypeName;
    }

    public void setCarTypeName(String carTypeName) {
        this.carTypeName = carTypeName;
    }

    public Set<CarRegister> getCarRegisterSet() {
        return carRegisterSet;
    }

    public void setCarRegisterSet(Set<CarRegister> carRegisterSet) {
        this.carRegisterSet = carRegisterSet;
    }
}
