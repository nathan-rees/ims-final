package com.qa.databases.entities;

public class Item {
	private String productName;
	private float cost;

	public Item(String productName,float cost) {
		this.productName=productName;
		this.cost=cost;

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
