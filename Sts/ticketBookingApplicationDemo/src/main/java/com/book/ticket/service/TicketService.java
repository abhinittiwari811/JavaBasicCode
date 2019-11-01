package com.book.ticket.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.book.ticket.dao.TicketBookingDao;
import com.book.ticket.entity.Ticket;

@Service
public class TicketService {

	@Autowired
	private TicketBookingDao ticketBookingDao;
	public Ticket createTicket(Ticket ticket) {
		return ticketBookingDao.save(ticket);
	}
	public Optional<Ticket> getTicketById(Integer ticketId) {
		return ticketBookingDao.findById(ticketId);
	}
	public Iterable<Ticket> getAllTicket() {
	
		return ticketBookingDao.findAll();
	}
	
	public void delteTicket(Integer ticketId) {
		// TODO Auto-generated method stub
		ticketBookingDao.deleteById(ticketId);
	}
	

}
