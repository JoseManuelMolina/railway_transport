package com.javaschool.railway_transport.controller;

import com.javaschool.railway_transport.model.Schedule;
import com.javaschool.railway_transport.repository.ScheduleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/")
public class ScheduleController {

    @Autowired
    private ScheduleRepository scheduleRepository;

    //get all schedules
    @GetMapping("/schedules")
    public ResponseEntity<List<Schedule>> getAllSchedules(){
        return new ResponseEntity<>(scheduleRepository.findAll(), HttpStatus.OK);
    }
}
