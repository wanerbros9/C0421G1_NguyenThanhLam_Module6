package com.codegym.model.service;

import com.codegym.model.entity.CarRegister;

import java.util.List;

public interface ICarRegisterService {
    List<CarRegister> findAll();

    CarRegister save(CarRegister carRegister);

    CarRegister findById(int id);

    void delete(int id);
}
