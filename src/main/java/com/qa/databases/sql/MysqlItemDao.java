package com.qa.databases.sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.qa.databases.entities.Customer;
import com.qa.databases.entities.Item;

public class MysqlItemDao implements Dao<Item>{
	/**
	 * creates the connection
	 * holds the crud functionalities that executes the sql statemnts
	 */
	private Connection connection;
	
	public MysqlItemDao(String password)  
	{	
		/**
		 * sets up the connection using the password
		 */
		try {
			this.connection=DriverManager.getConnection("jdbc:mysql://34.67.75.2:3306/ims","root",password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			
		}
	}
		


	public ArrayList readAll() {//return id list
		ArrayList<Item> lol=new ArrayList<Item>();
		try {
			Statement statement=connection.createStatement();
			ResultSet result=statement.executeQuery("select * from items");
			while(result.next()) {
				String product=result.getString("product_name");
				float cost=result.getFloat("cost");
				long id=result.getLong("id");

				lol.add(new Item(id,product,cost));
				}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			
		}
		
		return lol;
	}

	public void create(Item t) {
		try {
			
			Statement statement =connection.createStatement();
			statement.execute("insert into items (product_name,cost) values('"+t.getProductName()+"','"+t.getCost()+"')");
			//statement.executeUpdate("insert into customers(first_name, last_name) values('" + customer.getFirstname() + "','" + customer.getSurname()+"')");
		} catch (SQLException e) {
			System.out.println(e);
			e.printStackTrace();
		}finally {
			
		}
		
	}
	
	public void update(Item t) {
		try {
			Statement statement =connection.createStatement();
			statement.executeUpdate("update items set product_name='"+t.getProductName()+"',cost="+t.getCost());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			
		}
		
		
	}

	public void delete(Item t) {
		try {
			Statement statement =connection.createStatement();
			statement.executeUpdate("delete from items where product_name='"+t.getProductName()+"'");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			
		}
		
	}

}
