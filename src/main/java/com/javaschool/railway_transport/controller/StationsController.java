package com.javaschool.railway_transport.controller;

import com.javaschool.railway_transport.model.Stations;
import com.javaschool.railway_transport.repository.StationsRepository;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class StationsController {

    @Autowired
    private StationsRepository stationsRepository;

    //get all stations-train
    @GetMapping("/stations-trains")
    public ResponseEntity<List<Stations>> getAllStationsTrains(){
        return new ResponseEntity<>(stationsRepository.findAll(), HttpStatus.OK);
    }
}
