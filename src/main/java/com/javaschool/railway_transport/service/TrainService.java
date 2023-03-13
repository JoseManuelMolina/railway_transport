package com.javaschool.railway_transport.service;

import com.javaschool.railway_transport.model.Train;
import com.javaschool.railway_transport.repository.TrainRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TrainService {

    @Autowired
    private TrainRepository trainRepository;

    public List<Train> allTrains() {
        System.out.println("Getting all trains");
        return trainRepository.findAll();
    }

    public Optional<Train> singleTrain(Long number){
        return trainRepository.findById(number);
    }

}
