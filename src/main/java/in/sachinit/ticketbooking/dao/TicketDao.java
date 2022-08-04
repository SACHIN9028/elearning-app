package in.sachinit.ticketbooking.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import in.sachinit.ticketbooking.model.Ticket;

@Repository
public interface TicketDao extends CrudRepository<Ticket,Integer>{

	
	
	
	
	

}
