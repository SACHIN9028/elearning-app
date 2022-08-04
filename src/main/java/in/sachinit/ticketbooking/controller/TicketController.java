package in.sachinit.ticketbooking.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.sachinit.ticketbooking.model.Ticket;
import in.sachinit.ticketbooking.service.TicketService;

@RestController
@RequestMapping(value="/tickets")
public class TicketController {
	
	@Autowired
	private TicketService ticketservice;
	
	
	@PostMapping(value="/create")
	public Ticket createTicket(@RequestBody Ticket ticketObj)
	{
		return ticketservice.createTicket(ticketObj);
	}
	
	@DeleteMapping(value="/{ticketid}")
    public void deleteTicket(@PathVariable("ticketid") Integer ticketId)
    {
	   ticketservice.deleteTicket(ticketId);
    }
	
	@GetMapping(value="/{ticketid}")
	public Ticket getTicket(@PathVariable("ticketid") Integer ticketId)
	{
		return ticketservice.getTicket(ticketId);
	}
	
	@GetMapping(value="/all")
	public Iterable<Ticket> getAllTickets()
	{
		return ticketservice.getAllTickets();
	
	}
	
	@PutMapping(value="/{ticketid}/{email}")
	public Ticket updateMail(@PathVariable("ticketid")Integer ticketid,@PathVariable("email") String email)
	{
		return ticketservice.updateTicket(ticketid, email);
	}	
	
	
	
	
	

}
