package com.tka.shopingCenter;

public class Electronics extends Product {
	public int warrentyPeriod;
	public String brand;

	public Electronics(String productName, String productDescription, double productPrice, int warrentyPeriod, String brand) {
		super(productName, productDescription, productPrice);
		this.warrentyPeriod = warrentyPeriod;
		this.brand = brand;
	}
	
	public void calculateDiscount() {
		double discountedPrice = productPrice/10;
		double finalPrize = productPrice-discountedPrice;
		System.out.println("Electronics product");
		System.out.println("Product Name : "+productName);
		System.out.println("Product Description : "+productDescription);
		System.out.println("Product Orginal Price : "+productPrice);
		System.out.println("Discount amount : "+discountedPrice);
		System.out.println("Price after Discount : "+finalPrize);
		System.out.println("Warrenty Period : "+warrentyPeriod+" year");
		System.out.println("Product Brand : "+brand);
	}
}
