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
    Set<Ticket> tickets;

    public Train() {

    }

    public Train(Long number, int seatsTotal, int seatsOccupied) {
        this.number = number;
        this.seatsTotal = seatsTotal;
        this.seatsOccupied = seatsOccupied;
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

}
