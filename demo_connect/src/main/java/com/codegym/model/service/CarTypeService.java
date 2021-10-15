package com.codegym.model.service;

import com.codegym.model.entity.CarType;
import com.codegym.model.repository.ICarTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarTypeService implements ICarTypeService {

    @Autowired
    private ICarTypeRepository carTypeRepository;

    @Override
    public List<CarType> findAll() {
        return carTypeRepository.findAll();
    }

    @Override
    public void save(CarType carType) {
        carTypeRepository.save(carType);
    }

    @Override
    public void delete(int id) {
        carTypeRepository.deleteById(id);
    }

    @Override
    public CarType findById(int id) {
        return carTypeRepository.findById(id).get();
    }
}
