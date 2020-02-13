package com.qa.databases.sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.qa.databases.entities.Customer;

public class MysqlOrderDao implements Dao<Customer>{

	private Connection connection;

	public MysqlOrderDao(String password) 
	{	
		try {
			this.connection=DriverManager.getConnection("jdbc:mysql://34.67.75.2:3306/ims","root",password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			
		}
		
	}
	
	
	public void create(Customer t) {
		try {
			Statement statement =connection.createStatement();
			//statement.executeUpdate("Insert into orders values(id=1,customers_id="+t.getId()+")");
			statement.executeUpdate("insert into orders(customers_id) select id from customers where email='"+t.getEmail()+"'");//only gets the email
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			
		}
		
		
	}

	public ArrayList readAll() {//return id list
		ArrayList<Long> lol=new ArrayList<Long>();
		try {
			Statement statement=connection.createStatement();
			ResultSet result=statement.executeQuery("select * from orders");
			while(result.next()) {
				lol.add(result.getLong("id"));
				}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			
		}
		
		return lol;
	}

	public void update(Customer t) {
		try {
			Statement statement=connection.createStatement();
			statement.executeUpdate("update orders set customers_id="+t.getId()+"where id=");//to do
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			
		}
		
		
	}

	public void delete(Customer t) {
		try {
			Statement statement =connection.createStatement();
			 statement.executeUpdate("delete from orders where id="+t.getId());
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			
		}
		
		
	}

}
