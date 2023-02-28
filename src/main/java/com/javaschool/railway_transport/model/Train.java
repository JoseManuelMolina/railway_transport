package com.javaschool.railway_transport.model;

import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name = "train")
public class Train {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //ID Autoincrement
    @Column(name = "number")
    private Long number;

    @Column(name = "seats_total")
    private int seatsTotal;

    @Column(name = "seats_occupied")
    private int seatsOccupied;

    @OneToMany(mappedBy = "train")
    private Set<Schedule> schedules;

    @OneToMany(mappedBy = "train")
    private Set<Stations> stations;

    @OneToMany(mappedBy = "train")
    Set<Ticket> tickets;

    public Train() {

    }

    public Train(Long number, int seatsTotal, int seatsOccupied, Set<Schedule> schedules, Set<Stations> stations, Set<Passenger> ticket) {
        this.number = number;
        this.seatsTotal = seatsTotal;
        this.seatsOccupied = seatsOccupied;
        this.schedules = schedules;
        this.stations = stations;
    }

    public Long getNumber() {
        return number;
    }

    public void setNumber(Long number) {
        this.number = number;
    }

    public int getSeatsTotal() {
        return seatsTotal;
    }

    public void setSeatsTotal(int seatsTotal) {
        this.seatsTotal = seatsTotal;
    }

    public int getSeatsOccupied() {
        return seatsOccupied;
    }

    public void setSeatsOccupied(int seatsOccupied) {
        this.seatsOccupied = seatsOccupied;
    }

    public Set<Schedule> getSchedules() {
        return schedules;
    }

    public void setSchedules(Set<Schedule> schedules) {
        this.schedules = schedules;
    }

    public Set<Stations> getStations() {
        return stations;
    }

    public void setStations(Set<Stations> stations) {
        this.stations = stations;
    }

}
