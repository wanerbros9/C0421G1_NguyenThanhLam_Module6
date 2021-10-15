package com.codegym.model.repository;

import com.codegym.model.entity.CarStation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICarStationRepository extends JpaRepository<CarStation, Integer> {
}
