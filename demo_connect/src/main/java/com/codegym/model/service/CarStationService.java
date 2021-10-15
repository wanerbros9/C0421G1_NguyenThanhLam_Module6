package com.codegym.model.service;

import com.codegym.model.entity.CarStation;
import com.codegym.model.repository.ICarStationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarStationService implements ICarStationService {

    @Autowired
    private ICarStationRepository carStationRepository;

    @Override
    public List<CarStation> findAll() {
        return carStationRepository.findAll();
    }

    @Override
    public void save(CarStation carStation) {
        carStationRepository.save(carStation);
    }

    @Override
    public void delete(int id) {
        carStationRepository.deleteById(id);
    }

    @Override
    public CarStation findById(int id) {
        return carStationRepository.findById(id).get();
    }
}
