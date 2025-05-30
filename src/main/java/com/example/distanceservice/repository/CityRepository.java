package com.example.distanceservice.repository;

import com.example.distanceservice.entity.City;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CityRepository extends JpaRepository<City, Long> {
    City findByName(String name);
}