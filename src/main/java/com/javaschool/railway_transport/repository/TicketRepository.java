package com.javaschool.railway_transport.repository;

import com.javaschool.railway_transport.model.Ticket;
import com.javaschool.railway_transport.model.TicketKey;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TicketRepository extends JpaRepository<Ticket, TicketKey> {
}
