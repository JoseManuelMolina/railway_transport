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
    private int seats_total;

    @Column(name = "seats_occupied")
    private int seats_occupied;

    @OneToMany(mappedBy = "train")
    private Set<Schedule> schedules;

    @OneToMany(mappedBy = "train")
    private Set<Stations> stations;

    @OneToMany(mappedBy = "train")
    Set<Ticket> tickets;

    public Train() {

    }

    public Train(Long number, int seats_total, int seats_occupied, Set<Schedule> schedules, Set<Stations> stations, Set<Passenger> ticket) {
        this.number = number;
        this.seats_total = seats_total;
        this.seats_occupied = seats_occupied;
        this.schedules = schedules;
        this.stations = stations;
    }

    public Long getNumber() {
        return number;
    }

    public void setNumber(Long number) {
        this.number = number;
    }

    public int getSeats_total() {
        return seats_total;
    }

    public void setSeats_total(int seats_total) {
        this.seats_total = seats_total;
    }

    public int getSeats_occupied() {
        return seats_occupied;
    }

    public void setSeats_occupied(int seats_occupied) {
        this.seats_occupied = seats_occupied;
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
