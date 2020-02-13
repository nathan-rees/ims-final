package com.qa.databases;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

import com.qa.databases.entities.Customer;
import com.qa.databases.entities.Item;
import com.qa.databases.sql.MysqlCustomerDao;
import com.qa.databases.sql.MysqlItemDao;
import com.qa.databases.sql.MysqlOrderDao;
import com.qa.databases.sql.MysqlOrderlineDao;

public class SetUp 
{
	private String password;
	private Customer customer;
	private Item item;
	public SetUp()
	{
		intro();
	}
	public String crud() {
		System.out.println("press 1 for create ");
		System.out.println("press 2 for viewing all");
		System.out.println("press 3 for update ");
		System.out.println("press 4 for delete");
		return userInput();
	}
	public void intro()
	{
		System.out.println("Enter the Password for the database..");
		password=userInput();
		System.out.println("Press 1 for editing a customer");
		System.out.println("Press 2 for editing an order");
		System.out.println("Press 3 for editing an item");
		String input=userInput();
		
		
		if(input.equals("1"))
		{
			customer();
		}else if(input.equals("2"))
		{
			order();
		}else if(input.equals("3"))
		{
			item();
		}else {
			System.out.println("fingers too t h i c c");
			intro();
		}
		intro();
	}
	public void item() {
		createItem();
		
		MysqlItemDao i=new MysqlItemDao(password);
		System.out.println("Enter 0 for adding an item to an existing order");
		String input=crud();
		
		if(input.equals("1"))
		{
			i.create(item);System.out.println("Created Item successfully...");
		}else if(input.equals("2"))
		{
			ArrayList<Item> list=i.readAll();
			for(Item haha:list)
			{
				System.out.println("printing product names...");
				System.out.println(haha.getProductName());//prints the product name and all 
			}
			
			
		}else if(input.equals("3"))
		{
			i.update(item);//update and item
		}else if(input.equals("4"))
		{
			System.out.println("(deleting is based product name entered)");
			i.delete(item);//delete an item based on its product name
			System.out.println("Deleted successfully");
		}else if(input.equals("0"))
		{
			createCustomer();
			orderlineAdd(item,customer);
		}
	}
	public void orderlineAdd(Item item,Customer customer)
	{
		System.out.println("Enter order ID,quantity");
		int orderID=Integer.valueOf(userInput());
		int quantity=Integer.valueOf(userInput());
		
		try {
			MysqlOrderlineDao orderline=new MysqlOrderlineDao(password,(int)item.getId(),orderID,quantity);
			orderline.create(69);//adding an  linking up the order and item
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public void createItem() {
		System.out.println("Enter product id,name,cost");
		long id=Long.valueOf(userInput());
		String productName=userInput();
		float cost=Float.valueOf(userInput());
		this.item=new Item(id,productName,cost);
	}
	
	public void order()
	{
		
		MysqlOrderDao o=new MysqlOrderDao(password);
		createCustomer();
		String input=crud();
		
		if(input.equals("1"))//need to create total cost
		{
			
			o.create(customer);//make an order to a someone with the email
		}else if(input.equals("2"))//should probably do more other than print the ids...
		{
			System.out.println("Outputting all order IDs.. ");
			ArrayList<Long> ids=o.readAll();
			for(long id:ids)
			{
				System.out.println(id);
			}
			
		}else if (input.equals("3"))//changes the customer id
		{
			o.update(customer);
		}else if(input.equals("4"))//deletes the orders where the customers id 
		{
			o.delete(customer);
		}
	}
	
	public void customer()
	{
		createCustomer();//creating the cutomer to edit or add
		MysqlCustomerDao c=new MysqlCustomerDao(password);
		String input=crud();
		
		if(input.equals("1"))
		{
			c.create(customer);System.out.println("Created successfully...");
			
		}else if(input.equals("2"))
		{
			for(Customer lol:c.readAll())
			System.out.println("email: "+lol.getEmail()+"Name: "+ lol.getFirstname()+" "+lol.getSurname());
			
		}else if(input.equals("3"))
		{
			c.update(customer);System.out.println("Updated successfully..");
		}else if(input.equals("4"))
		{
			c.delete(customer);System.out.println("Deleted successfully");
		}else {
			System.out.println("error....your fingers are too t h i c c");
			customer();
		}
		
	}
	public void createCustomer()
	{
		System.out.println("Enter id,first name,last name,email for a new/existing customer");
		long id=Long.valueOf(userInput());
		String first=userInput();
		String last=userInput();
		String email=userInput();
		customer=new Customer(id,first,last,email);
	}
	
	public String userInput() {
		Scanner scan=new Scanner(System.in);
		return scan.nextLine();
	}
}
