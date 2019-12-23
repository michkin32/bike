package com.globomatics.bikes.controllers;

import com.globomatics.bikes.models.Bike;
import com.globomatics.bikes.repositories.BikeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/v1/bikes")
public class BikesController {


    private BikeRepository bikeRepository;

    @Autowired
    public BikesController(BikeRepository bikeRepository){
        this.bikeRepository = bikeRepository;
    }

    @GetMapping
    public Iterable<Bike> list(){
        return bikeRepository.findAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public void create(@RequestBody Bike bike){
        bikeRepository.save(bike);
    }

    @GetMapping("/{id}")
    public Optional<Bike> get(@PathVariable("id") long id){
        return bikeRepository.findById(id);
    }
}
