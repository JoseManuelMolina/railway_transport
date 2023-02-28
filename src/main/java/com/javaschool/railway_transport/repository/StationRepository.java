package com.javaschool.railway_transport.repository;

import com.javaschool.railway_transport.model.Station;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StationRepository extends JpaRepository<Station, Long> {
}
