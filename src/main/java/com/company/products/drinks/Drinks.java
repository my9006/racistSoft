package com.company.products.drinks;

import com.company.products.Product;

public enum Drinks implements Product {
	TAN(100),
	MACNABRDOSH(200),
	QARAHUNJ(2000);

	private int price;

	Drinks(int price) {
		this.price = price;
	}

	public int getPrice() {
		return price;
	}
}