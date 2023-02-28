package com.javaschool.railway_transport.repository;

import com.javaschool.railway_transport.model.Stations;
import com.javaschool.railway_transport.model.StationsKey;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StationsRepository extends JpaRepository<Stations, StationsKey> {
}
