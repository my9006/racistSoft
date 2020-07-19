package com.company.products.chipses;

import com.company.products.Product;

public enum Chipses implements Product {
	DORITOS(140),
	CHEETOS(180),
	RUFFLES(120);

	private int price;

	Chipses(int price) {
		this.price = price;

	}

	public int getPrice() {
		return price;
	}
}