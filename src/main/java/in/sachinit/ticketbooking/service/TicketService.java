package in.sachinit.ticketbooking.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.sachinit.ticketbooking.dao.TicketDao;
import in.sachinit.ticketbooking.model.Ticket;
@Service
public class TicketService {
	@Autowired
	private TicketDao ticketdao;
	
	
	
	public Ticket createTicket(Ticket ticketObj)
	{
		return ticketdao.save(ticketObj);
	}
	
	public void deleteTicket(Integer ticketId)
	{
		ticketdao.deleteById(ticketId);
	}
	
	public Ticket getTicket(Integer ticketId)
	{
		return ticketdao.findById(ticketId).orElse(new Ticket()) ;
	}
	
	public Iterable<Ticket> getAllTickets()
	{ 
		
		return ticketdao.findAll();
		
	}
	
	public Ticket updateTicket(Integer ticketId,String newemail)
	{
	Ticket ticketobj=getTicket(ticketId);
	ticketobj.setEmail(newemail);
	return ticketdao.save(ticketobj);
		
	}

}
