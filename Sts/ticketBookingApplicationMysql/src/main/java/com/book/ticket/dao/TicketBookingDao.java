package com.book.ticket.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.book.ticket.entity.Ticket;
@Repository

public interface TicketBookingDao extends CrudRepository<Ticket, Integer>{

}
