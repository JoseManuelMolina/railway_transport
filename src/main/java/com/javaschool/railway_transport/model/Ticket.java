package com.javaschool.railway_transport.model;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class Ticket {

    @EmbeddedId
    private TicketKey ticketKey;

    @ManyToOne
    @MapsId("train_number")
    @JoinColumn(name = "train_id")
    Train train;

    @ManyToOne
    @MapsId("passenger_id")
    @JoinColumn(name = "passenger_id")
    Passenger passenger;

    LocalDate date_time_buy;

    public Ticket(TicketKey ticketKey, Train train, Passenger passenger, LocalDate date_time_buy) {
        this.ticketKey = ticketKey;
        this.train = train;
        this.passenger = passenger;
        this.date_time_buy = date_time_buy;
    }

    public Ticket() {}

    public TicketKey getTicketKey() {
        return ticketKey;
    }

    public void setTicketKey(TicketKey ticketKey) {
        this.ticketKey = ticketKey;
    }

    public Train getTrain() {
        return train;
    }

    public void setTrain(Train train) {
        this.train = train;
    }

    public Passenger getPassenger() {
        return passenger;
    }

    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }

    public LocalDate getDate_time_buy() {
        return date_time_buy;
    }

    public void setDate_time_buy(LocalDate date_time_buy) {
        this.date_time_buy = date_time_buy;
    }
}
