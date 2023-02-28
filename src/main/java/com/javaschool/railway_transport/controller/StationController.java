package com.javaschool.railway_transport.controller;

import com.javaschool.railway_transport.model.Station;
import com.javaschool.railway_transport.repository.StationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/")
public class StationController {

    @Autowired
    private StationRepository stationRepository;

    //get all stations
    @GetMapping("/stations")
    public ResponseEntity<List<Station>> getAllStations(){
        return new ResponseEntity<>(stationRepository.findAll(), HttpStatus.OK);
    }
}
