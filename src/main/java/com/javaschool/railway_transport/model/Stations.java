package com.javaschool.railway_transport.model;

import jakarta.persistence.*;

@Entity
public class Stations {

    @EmbeddedId
    private StationsKey id;

    @ManyToOne
    @MapsId("stationId")
    @JoinColumn(name = "station_id")
    private Station station;

    @ManyToOne
    @MapsId("trainNumber")
    @JoinColumn(name = "train_number")
    private Train train;

    public Stations() {
    }

    public Stations(StationsKey id, Station station, Train train) {
        this.id = id;
        this.station = station;
        this.train = train;
    }

    public StationsKey getId() {
        return id;
    }

    public void setId(StationsKey id) {
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
}
