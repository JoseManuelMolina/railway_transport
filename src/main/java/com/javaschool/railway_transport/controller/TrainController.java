package com.javaschool.railway_transport.controller;

import com.javaschool.railway_transport.model.Train;
import com.javaschool.railway_transport.repository.TrainRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/trenes")
public class TrainController {

    @Autowired
    TrainRepository trainRepository;

    @GetMapping("/train")
    public String trainInfo(){
        return "Hola tren";
    }

    @GetMapping("/prueba")
    public ResponseEntity<List<Train>> getTrains(){
        return new ResponseEntity<>(trainRepository.findAll(), HttpStatus.OK);
    }


}
