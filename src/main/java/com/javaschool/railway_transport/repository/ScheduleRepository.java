package com.javaschool.railway_transport.repository;

import com.javaschool.railway_transport.model.Schedule;
import com.javaschool.railway_transport.model.ScheduleKey;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ScheduleRepository extends JpaRepository<Schedule, ScheduleKey> {
}
