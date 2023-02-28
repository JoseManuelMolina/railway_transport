package com.javaschool.railway_transport.model;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class TicketKey implements Serializable {

    @Column(name = "train_number")
    Long train_number;

    @Column(name = "passenger_id")
    Long passenger_id;

    public TicketKey() {
    }

    public TicketKey(Long train_number, Long passenger_id) {
        this.train_number = train_number;
        this.passenger_id = passenger_id;
    }

    public Long getTrain_number() {
        return train_number;
    }

    public void setTrain_number(Long train_number) {
        this.train_number = train_number;
    }

    public Long getPassenger_id() {
        return passenger_id;
    }

    public void setPassenger_id(Long passenger_id) {
        this.passenger_id = passenger_id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TicketKey ticketKey)) return false;
        return train_number.equals(ticketKey.train_number) && passenger_id.equals(ticketKey.passenger_id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(train_number, passenger_id);
    }
}
