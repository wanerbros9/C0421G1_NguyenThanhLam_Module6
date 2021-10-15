package com.codegym.rest_controller;

import com.codegym.dto.CarRegisterDto;
import com.codegym.model.entity.CarRegister;
import com.codegym.model.entity.CarStation;
import com.codegym.model.service.ICarRegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/car/api")
public class CarRegisterRestController {

    @Autowired
    private ICarRegisterService carRegisterService;

    @GetMapping
    public ResponseEntity<List<CarRegister>> showAll() {
        List<CarRegister> carRegisters = carRegisterService.findAll();
        if (carRegisters.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(carRegisters, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity edit(@ModelAttribute @Validated CarRegisterDto carRegisterDto,
                               BindingResult bindingResult,
                               Model model){
        CarRegister carRegister = carRegisterService.findById(id);
    }
}
