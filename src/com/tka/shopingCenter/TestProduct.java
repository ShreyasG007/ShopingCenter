package com.tka.shopingCenter;

public class TestProduct {

	public static void main(String[] args) {
		Electronics electronics = new Electronics("Iphone", "Mobile Phone", 100000,1, "Apple");
		
		electronics.calculateDiscount();
		
		System.out.println();
		
		Clothing clothing = new Clothing("Levis Jeans", "Black jeans",2000 , 34,"Black", "Cotton");
		
		clothing.calculatedDiscount();
		
		
		
	}

}
