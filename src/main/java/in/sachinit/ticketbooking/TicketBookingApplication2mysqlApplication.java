package in.sachinit.ticketbooking;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import in.sachinit.ticketbooking.model.Ticket;
import in.sachinit.ticketbooking.service.TicketService;

@SpringBootApplication
public class TicketBookingApplication2mysqlApplication implements CommandLineRunner{

	@Autowired
	private TicketService ticketservice;
	public static void main(String[] args) {
		SpringApplication.run(TicketBookingApplication2mysqlApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		Ticket ticketobj=new Ticket();
		ticketobj.setPassengerName("Sachin");
		ticketobj.setDestinationStation("Aurangabad");
		ticketobj.setSourceStation("Pune");
		ticketobj.setTravelDate(new Date());
		ticketobj.setEmail("sac@gmail.com");
		
		ticketservice.createTicket(ticketobj);
		
		
	}

	
	
}
