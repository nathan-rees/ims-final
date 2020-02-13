package com.qa.databases.entities;

public class Item {
	private String productName;
	private long id;
	private float cost;
	private long id;

	public Item(long id,String productName,float cost) {
		this.productName=productName;
		this.cost=cost;
		this.id=id;

	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public float getCost() {
		return cost;
	}
	public void setCost(float cost) {
		this.cost = cost;
	}
	
	
}
