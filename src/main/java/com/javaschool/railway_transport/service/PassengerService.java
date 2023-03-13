package com.javaschool.railway_transport.service;

import com.javaschool.railway_transport.model.Passenger;
import com.javaschool.railway_transport.repository.PassengerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class PassengerService {

    private PassengerRepository passengerRepository;

    @Autowired
    private JdbcTemplate jdbcTemplate;


}
