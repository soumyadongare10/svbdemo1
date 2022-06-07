package com.demo.svb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.demo.svb.dao.TicketDao;

import com.demo.svb.model.Ticket;


@RestController 
//It is a  convience annotation for creating RESTFul controllers.
//It also eliminates to annotate @ResponseBody for every request handling method
@RequestMapping("/ticket")
// maps a specific request path or pattern onto a controller. 
public class TicketController {
	
	@Autowired
	//is used for dependency injection.
	private TicketDao dao;
	
	@PostMapping
	public String bookTicket(@RequestBody List<Ticket> tickets) {
		dao.saveAll(tickets);
		return "ticket booked : " +tickets.size();
	}
	
	
	@GetMapping
	public List<Ticket> getTickets(){
		return (List<Ticket>) dao.findAll();
		
	}
	
	
	
	
	

}
