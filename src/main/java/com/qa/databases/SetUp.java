package com.qa.databases;

import java.util.ArrayList;
import java.util.Scanner;

import com.qa.databases.entities.Customer;
import com.qa.databases.entities.Item;
import com.qa.databases.sql.MysqlCustomerDao;
import com.qa.databases.sql.MysqlItemDao;
import com.qa.databases.sql.MysqlOrderDao;

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
	}
	public void item() {
		System.out.println("Enter product name,cost");
		String productName=userInput();
		float cost=Float.valueOf(userInput());
		createItem(productName,cost);
		
		MysqlItemDao i=new MysqlItemDao(password);
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
		}
	}
	public void createItem(String productName,float cost) {
		this.item=new Item(productName,cost);
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
			System.out.println("email: "+lol.getEmail()+ lol.getFirstname()+lol.getSurname());
			
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
