package com.tka.shopingCenter;

public class Product {
	public String productName;
	public String productDescription;
	public double productPrice;
	
	public Product() {
		
	}
	public Product(String name, String description, double price) {
		super();
		this.productName = name;
		this.productDescription = description;
		this.productPrice = price;
	}
	public void calculateDiscount() {
		System.out.println("Discount Successful!!!");
	}
	
}
