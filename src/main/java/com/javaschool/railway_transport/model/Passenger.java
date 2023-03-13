package com.javaschool.railway_transport.model;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.Set;

@Entity
@Table(name = "passenger")
public class Passenger {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "phone_number")
    private String phone_number;

    @Column(name = "name")
    private String name;

    @Column(name = "surname")
    private String surname;

    @Column(name = "date_birth")
    private LocalDate date_birth;

    @OneToMany(mappedBy = "passenger")
    Set<Ticket> tickets;

    public Passenger() {
    }

    public Passenger(String phone_number, String name, String surname, LocalDate date_birth) {
        this.phone_number = phone_number;
        this.name = name;
        this.surname = surname;
        this.date_birth = date_birth;
    }

    public Long getId() {
        return id;
    }

    public String getPhoneNumber() {
        return phone_number;
    }

    public void setPhoneNumber(String phone_number) {
        this.phone_number = phone_number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public LocalDate getDateBirth() {
        return date_birth;
    }

    public void setDateBirth(LocalDate date_birth) {
        this.date_birth = date_birth;
    }
}
