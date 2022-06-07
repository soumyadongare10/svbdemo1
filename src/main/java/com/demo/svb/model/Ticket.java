package com.demo.svb.model;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
//specifies that the class is an entity and is mapped to a database table.
@Table(name = "Ticket")

//Lombok dependency is added so that we can use these annotations to reduce the code
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Ticket {
	
	@Id
	//The @Id annotation specifies the primary key of an entity
    @GeneratedValue
	//The @GeneratedValue annotation provides the specification of generation strategies for the primary keys values.
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column
	private double amount;
	@Column
	private String category;

}