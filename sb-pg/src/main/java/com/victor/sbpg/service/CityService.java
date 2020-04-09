package com.victor.sbpg.service;

import java.util.List;

import com.victor.sbpg.model.City;
import com.victor.sbpg.repository.CityRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CityService implements ICityService {

    @Autowired
    private CityRepository repository;

    @Override
    public List<City> findAll() {
        final List<City> cities = (List<City>) repository.findAll();
        return cities;
    }
}