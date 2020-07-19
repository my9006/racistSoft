package com.company.vendingMachine;

import com.company.products.Product;

import java.util.HashMap;

public class VMVendor {

	public Product getProduct() {
		try {
			HashMap<String, Integer> command = new VMInterface().commandForammter();
			String productKey = command.keySet().toArray()[0].toString();
			try {
				Product product = VMMatrixBuilder.getMatrix().get(productKey).get(command.get(productKey)).get(0);
				VMMatrixBuilder.getMatrix().get(productKey).get(command.get(productKey)).remove(0);
				System.out.printf("Take %s from bottom side", product.toString().toLowerCase());
				return product;
			} catch (IndexOutOfBoundsException ex) {
				System.out.println("Are you blind nigga? Can't you see that the self is empty nigga?");
			}

		}catch (WrongFormattException | ArrayIndexOutOfBoundsException ex){
			System.out.println("I am disappointed nigga, give another shot");
			getProduct();
		}
		return null;
	}
}