package com.codegym.model.repository;

import com.codegym.model.entity.CarType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICarTypeRepository extends JpaRepository<CarType, Integer> {
}
