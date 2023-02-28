package com.javaschool.railway_transport.controller;

import com.javaschool.railway_transport.model.Passenger;
import com.javaschool.railway_transport.repository.PassengerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/")
public class PassengerController {

    @Autowired
    private PassengerRepository passengerRepository;

    //get all passengers
    @GetMapping("/passengers")
    public ResponseEntity<List<Passenger>> getAllPassengers(){
        return new ResponseEntity<>(passengerRepository.findAll(), HttpStatus.OK);
    }


}
