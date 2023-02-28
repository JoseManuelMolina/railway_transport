package com.javaschool.railway_transport.model;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class StationsKey implements Serializable {

    @Column(name = "station_id")
    private Long stationId;

    @Column(name = "train_number")
    private Long trainNumber;

    public StationsKey() {
    }

    public StationsKey(Long stationId, Long trainNumber) {
        this.stationId = stationId;
        this.trainNumber = trainNumber;
    }

    public Long getStationId() {
        return stationId;
    }

    public void setStationId(Long stationId) {
        this.stationId = stationId;
    }

    public Long getTrainNumber() {
        return trainNumber;
    }

    public void setTrainNumber(Long trainNumber) {
        this.trainNumber = trainNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof StationsKey that)) return false;
        return stationId.equals(that.stationId) && trainNumber.equals(that.trainNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(stationId, trainNumber);
    }
}
