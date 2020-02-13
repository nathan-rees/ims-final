package com.qa.databases;

import java.sql.SQLException;
import java.util.ArrayList;

import com.qa.databases.entities.*;
import com.qa.databases.sql.MysqlCustomerDao;
import com.qa.databases.sql.MysqlItemDao;
import com.qa.databases.sql.MysqlOrderDao;
import com.qa.databases.sql.MysqlOrderlineDao;

public class Runner {
	public static void main(String[] args) throws SQLException {
		SetUp s=new SetUp();
		System.out.println("dleee");
//		MysqlCustomerDao dao=new MysqlCustomerDao("Nuggetpowerfish1");
//		Customer c=new Customer((long)1,"one","lol","@noob");
//		dao.update(c);
//		MysqlOrderDao a=new MysqlOrderDao("Nuggetpowerfish1");
//		a.create(c);
//		a.delete(c);
//		
//		Item i=new Item("froge",70);
//		MysqlItemDao b = new MysqlItemDao("Nuggetpowerfish1");
//		MysqlOrderlineDao cc=new MysqlOrderlineDao("Nuggetpowerfish1", 3, 2, 69);
//		cc.update(4);
//		cc.delete(3);
//		ArrayList<Long> haha=a.readAll();
//		ArrayList<Item> jaja =b.readAll();
//		for(Item xd: jaja)
//		{
//			System.out.println(xd.getProductName());
//			System.out.println(xd.getCost());
//		}
		
		//dao.delete("");//pass in what id will be deleted
//		ArrayList<Customer> custom=dao.readAll();
//		for(Customer customer: custom)
//		{
//			
//			System.out.println(customer.getId()+customer.getFirstname());
//			
//		}

	}
}
