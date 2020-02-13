package com.qa.databases.sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.qa.databases.entities.Customer;

public class MysqlOrderlineDao implements Dao<Integer>
{
	private Connection connection;
	private int items_id,orders_id,quantity;
	public MysqlOrderlineDao(String password,int items_id,int orders_id,int quantity) 
	{	
		
		try {
			this.connection=DriverManager.getConnection("jdbc:mysql://34.67.75.2:3306/ims","root",password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.items_id=items_id;
		this.orders_id=orders_id;
		this.quantity=quantity;
	}

	public void create(Integer t) {
		Statement statement;
		try {
			statement = connection.createStatement();
			statement.executeUpdate("insert into orderline(items_id,orders_id,quantity) values("+items_id+","+orders_id+","+quantity+")");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		
	}

	public ArrayList<Customer> readAll() {
		
		return null;
	}

	public void update(Integer t) {//updates the quatity and items id (not the orders_id)
		try {			
			Statement statement= connection.createStatement();
			statement.execute("update orderline set items_id="+items_id+" where orders_id="+orders_id);
			statement.execute("update orderline set quantity="+quantity+" where orders_id="+orders_id);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public void delete(Integer t) {
		try {
			Statement statement=connection.createStatement();
			statement.executeUpdate("delete from orderline where orders_id="+orders_id);
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	
}
