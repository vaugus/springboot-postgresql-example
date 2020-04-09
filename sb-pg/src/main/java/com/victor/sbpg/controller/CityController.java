package com.victor.sbpg.controller;

import java.util.List;

import com.victor.sbpg.model.City;
import com.victor.sbpg.service.ICityService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CityController {

    @Autowired
    private ICityService cityService;

    @GetMapping("/showCities")
    public String findCities(final Model model) {
        final List<City> cities = (List<City>) cityService.findAll();

        model.addAttribute("cities", cities);

        return "showCities";
    }
}