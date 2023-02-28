package com.javaschool.railway_transport.model;

import jakarta.persistence.*;

import java.sql.Time;

@Entity
public class Schedule {

    @EmbeddedId
    private ScheduleKey id;

    @ManyToOne
    @MapsId("stationId")
    @JoinColumn(name = "station_id")
    private Station station;

    @ManyToOne
    @MapsId("trainNumber")
    @JoinColumn(name = "train_number")
    private Train train;

//    @Column(name = "time")
//    private Time time;

    public Schedule() {
    }

    public Schedule(ScheduleKey id, Station station, Train train) {
        this.id = id;
        this.station = station;
        this.train = train;
//        this.time = time;
    }

    public ScheduleKey getId() {
        return id;
    }

    public void setId(ScheduleKey id) {
        this.id = id;
    }

    public Station getStation() {
        return station;
    }

    public void setStation(Station station) {
        this.station = station;
    }

    public Train getTrain() {
        return train;
    }

    public void setTrain(Train train) {
        this.train = train;
    }

//    public Time getTime() {
//        return time;
//    }
//
//    public void setTime(Time time) {
//        this.time = time;
//    }
}
