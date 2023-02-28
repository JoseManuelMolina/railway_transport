package com.javaschool.railway_transport.controller;

import com.javaschool.railway_transport.model.Train;
import com.javaschool.railway_transport.repository.TrainRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class TrainController {

    @Autowired
    TrainRepository trainRepository;

    @GetMapping("/trains")
    public ResponseEntity<List<Train>> getAllTrains(@PathVariable int num){
        return new ResponseEntity<>(trainRepository.findAll(), HttpStatus.OK);
//        return new ResponseEntity<>(trainRepository.findTrainsBySeatsTotalGreaterThan(num), HttpStatus.OK);
    }


}
