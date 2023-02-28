package com.javaschool.railway_transport.model;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.io.Serializable;
import java.sql.Time;
import java.util.Objects;

@Embeddable
public class ScheduleKey implements Serializable {

    @Column(name = "station_id")
    private Long stationId;


    @Column(name = "train_number")
    private Long trainNumber;

    @Column(name = "time")
    private Time time;

    public ScheduleKey() {
    }

    public ScheduleKey(Long stationId, Long trainNumber, Time time) {
        this.stationId = stationId;
        this.trainNumber = trainNumber;
        this.time = time;
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

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ScheduleKey that)) return false;
        return stationId.equals(that.stationId) && trainNumber.equals(that.trainNumber) && time.equals(that.time);
    }

    @Override
    public int hashCode() {
        return Objects.hash(stationId, trainNumber, time);
    }
}
