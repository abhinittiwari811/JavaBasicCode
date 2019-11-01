package com.book.ticket;

import java.util.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.book.ticket.entity.Ticket;
import com.book.ticket.service.TicketService;

@SpringBootApplication
public class TicketBookingApplicationDemoApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ap=SpringApplication.run(TicketBookingApplicationDemoApplication.class, args);
		TicketService ticketService=ap.getBean("ticketService",TicketService.class);
		Ticket tk=new Ticket();
		tk.setPassengerName("Bhav");
		tk.setBookdate(new Date());
		//tk.setTicketId(1);
		tk.setSource("blr");
		tk.setDestination("vransi");
		ticketService.createTicket(tk);
	}

}
