package com.javaschool.railway_transport.repository;

import com.javaschool.railway_transport.model.Train;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;


public interface TrainRepository extends JpaRepository<Train, Long>{

//    List<Train> findTrainsBySeatsTotalGreaterThan(int seatsTotal);

}
