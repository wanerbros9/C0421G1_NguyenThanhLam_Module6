package com.codegym.model.repository;

import com.codegym.model.entity.CarRegister;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICarRegisterRepository extends JpaRepository<CarRegister, Integer> {
}
