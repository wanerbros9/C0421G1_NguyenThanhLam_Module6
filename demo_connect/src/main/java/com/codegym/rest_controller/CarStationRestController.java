package com.codegym.rest_controller;

import com.codegym.model.entity.CarStation;
import com.codegym.model.service.ICarStationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/carStation/api")
public class CarStationRestController {

    @Autowired
    private ICarStationService carStationService;

    @GetMapping
    public ResponseEntity<List<CarStation>> showList() {
        List<CarStation> carStations = carStationService.findAll();
        if (carStations.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(carStations, HttpStatus.OK);
    }
}
