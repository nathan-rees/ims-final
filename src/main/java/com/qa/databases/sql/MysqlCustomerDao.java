package com.qa.databases.sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.qa.databases.entities.Customer;

public class MysqlCustomerDao implements Dao<Customer>{
	
	private Connection connection;

	public MysqlCustomerDao(String password) 
	{	
		try {
			this.connection=DriverManager.getConnection("jdbc:mysql://34.67.75.2:3306/ims","root",password);
		} catch (SQLException e) {
			
			e.printStackTrace();
		}finally {
			
		}
		
	}
	
	
	
	public void create(Customer customer)
	{
		try {
			Statement statement=connection.createStatement();
			statement.executeUpdate("insert into customers(first_name, last_name,email) values('" + customer.getFirstname() + "','" + customer.getSurname()+"','"+customer.getEmail()+"')");
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			
		}
		
	}

	public void update(Customer t) {//updates customer info
		try {
			Statement statement =connection.createStatement();
			statement.executeUpdate("update customers set first_name='"+t.getFirstname()+"',last_name='"+t.getSurname()+"',email='"+t.getEmail()+"'"+ "where id="+t.getId());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			
		}
		
		
	}

	public void delete(Customer c) {
		
		try {
			Statement statement =connection.createStatement();
			
			 statement.executeUpdate("delete from customers where id="+c.getId());
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			
		}
	}

	
	public ArrayList<Customer> readAll() {
		/**
		 * Queries for all customers in the database and then
		 * 
		 * returns an array of customers
		 */
		ArrayList<Customer> customers = new ArrayList<Customer>();
		try {
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery("select * from customers");
			while (resultSet.next()) {
				Long id = resultSet.getLong("id");
				String firstName = resultSet.getString("first_name");
				String surname = resultSet.getString("last_name");
				String email=resultSet.getString("email");
				customers.add(new Customer(id, firstName, surname,email));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			
		}
		
		return customers;
		
	}

	

	
}
