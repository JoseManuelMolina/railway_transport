package com.javaschool.railway_transport.model;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class Ticket {

    @EmbeddedId
    private TicketKey ticketKey;

    @ManyToOne
    @MapsId("train_number")
    @JoinColumn(name = "train_number")
    Train train;

    @ManyToOne
    @MapsId("passenger_id")
    @JoinColumn(name = "passenger_id")
    Passenger passenger;



    public Ticket(TicketKey ticketKey, Train train, Passenger passenger) {
        this.ticketKey = ticketKey;
        this.train = train;
        this.passenger = passenger;
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

}
