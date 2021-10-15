package com.codegym.model.service;

import com.codegym.model.entity.CarType;

import java.util.List;

public interface ICarTypeService {
    List<CarType> findAll();

    void save(CarType carType);

    void delete(int id);

    CarType findById(int id);
}
