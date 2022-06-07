package com.demo.svb.dao;
import org.springframework.data.repository.CrudRepository;

import com.demo.svb.model.*;

public interface TicketDao extends CrudRepository<Ticket, Integer> {
	
	//CrudRepository is a Spring Data interface for generic CRUD operations on a repository of a specific type

}
