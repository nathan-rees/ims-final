package com.qa.databases.entities;
/**
 * customer object is basically used to store database.
 * makes manipulating everything very easier within the program
 * @author Me
 *
 */
public class Customer {
	private Long id;
	private String firstname;
	private String surname;
	private String email;
	
	
	public Customer(Long id, String firstname, String surname,String email) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.surname = surname;
		this.email=email;
	}
	
	

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
}

