package com.codegym.model.service;

import com.codegym.model.entity.CarStation;

import java.util.List;

public interface ICarStationService {
    List<CarStation> findAll();

    void save(CarStation carStation);

    void delete(int id);

    CarStation findById(int id);
}
