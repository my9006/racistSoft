package com.company.products.snacks;

import com.company.products.Product;

public enum Snacks implements Product {
	MOZHOZH(800),
	JAMON(900),
	CHECHIL(600);
	private int price;

	Snacks(int price) {
		this.price = price;
	}

	public int getPrice() {
		return price;
	}

}
