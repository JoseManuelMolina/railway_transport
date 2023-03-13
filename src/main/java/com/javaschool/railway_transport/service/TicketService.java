package com.javaschool.railway_transport.service;

import com.javaschool.railway_transport.model.Ticket;
import com.javaschool.railway_transport.model.TicketKey;
import com.javaschool.railway_transport.repository.TicketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TicketService {

    @Autowired
    private TicketRepository ticketRepository;
    public List<Ticket> allTickets() {
        System.out.println("Getting all tickets");
        return ticketRepository.findAll();
    }

    public Optional<Ticket> singleTicket(TicketKey id){
        return ticketRepository.findById(id);
    }
}
