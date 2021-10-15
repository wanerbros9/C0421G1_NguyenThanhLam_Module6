package com.codegym.model.service;

import com.codegym.model.entity.CarRegister;
import com.codegym.model.repository.ICarRegisterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarRegisterService implements ICarRegisterService {

    @Autowired
    private ICarRegisterRepository carRegisterRepository;

    @Override
    public List<CarRegister> findAll() {
        return carRegisterRepository.findAll();
    }

    @Override
    public void save(CarRegister carRegister) {
        carRegisterRepository.save(carRegister);
    }

    @Override
    public CarRegister findById(int id) {
        return carRegisterRepository.findById(id).get();
    }

    @Override
    public void delete(int id) {
        carRegisterRepository.deleteById(id);
    }
}
