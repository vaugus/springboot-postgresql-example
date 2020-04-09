package com.victor.sbpg.repository;

import com.victor.sbpg.model.City;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CityRepository extends CrudRepository<City, Long> {}