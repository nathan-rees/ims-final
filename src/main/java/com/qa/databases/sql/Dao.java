package com.qa.databases.sql;
/**
 * used so the dao objects have these methods
 * for the mvp
 */

import java.awt.List;
import java.util.ArrayList;

import com.qa.databases.entities.Customer;

public interface Dao<T> {
	public void create(T t);
	//read
	public ArrayList<Customer> readAll();
	
	
	//update
	public void update(T t);
	
	//delete
	public void delete(T t);
}
