package com.javaschool.railway_transport.repository;

import com.javaschool.railway_transport.model.Passenger;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PassengerRepository extends JpaRepository<Passenger,Long> {



}
