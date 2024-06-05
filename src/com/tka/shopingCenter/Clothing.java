package com.tka.shopingCenter;

public class Clothing extends Product {
	public int size;
	public String color;
	public String material;
	public Clothing(String name, String description, double price, int size, String color, String material) {
		super(name, description, price);
		this.size = size;
		this.color = color;
		this.material = material;
	}
	
	public void calculatedDiscount() {
		double discountedPrice = productPrice/10;
		double finalPrize = productPrice-discountedPrice;
		System.out.println("Clothing product");
		System.out.println("Product Name : "+productName);
		System.out.println("Product Description : "+productDescription);
		System.out.println("Product Orginal Price : "+productPrice);
		System.out.println("Product Size : "+size);
		System.out.println("Product color : "+color);
		System.out.println("Product material : "+material);
		System.out.println("Discount amount : "+discountedPrice);
		System.out.println("Price after Discount : "+finalPrize);
	
	}
	
}
