package com.codegym.rest_controller;

import com.codegym.model.entity.CarRegister;
import com.codegym.model.entity.CarType;
import com.codegym.model.service.ICarTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/carType/api")
public class CarTypeRestController {

    @Autowired
    private ICarTypeService carTypeService;

    @GetMapping
    public ResponseEntity<List<CarType>> showList(){
        List<CarType> carTypes = carTypeService.findAll();
        if (carTypes.isEmpty()){
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(carTypes, HttpStatus.OK);
    }
}
