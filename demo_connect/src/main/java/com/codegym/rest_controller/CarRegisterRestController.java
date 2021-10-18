package com.codegym.rest_controller;

import com.codegym.model.entity.CarRegister;
import com.codegym.model.service.ICarRegisterService;
import com.codegym.model.service.ICarStationService;
import com.codegym.model.service.ICarTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/car/api")
public class CarRegisterRestController {

    @Autowired
    private ICarRegisterService carRegisterService;

    @Autowired
    private ICarTypeService carTypeService;

    @Autowired
    private ICarStationService carStationService;

    @GetMapping
    public ResponseEntity<List<CarRegister>> showAll() {
        List<CarRegister> carRegisters = carRegisterService.findAll();
        if (carRegisters.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(carRegisters, HttpStatus.OK);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<CarRegister> findById(@PathVariable Integer id){
        CarRegister carRegister = this.carRegisterService.findById(id);
        if (carRegister != null){
            return new ResponseEntity<>(carRegister, HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @PutMapping("/edit")
    public ResponseEntity<CarRegister> editCar(@RequestBody CarRegister carRegister) {
        CarRegister editCar = this.carRegisterService.save(carRegister);
        return new ResponseEntity<>(editCar, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<CarRegister> addCar(@RequestBody CarRegister carRegister) {
        CarRegister addCar = this.carRegisterService.save(carRegister);
        return new ResponseEntity<>(addCar, HttpStatus.CREATED);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteCar(@PathVariable("id") Integer id) {
        this.carRegisterService.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
