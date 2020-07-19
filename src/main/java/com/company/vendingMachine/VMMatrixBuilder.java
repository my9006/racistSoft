package com.company.vendingMachine;

import com.company.products.Product;
import com.company.products.chipses.Chipses;
import com.company.products.drinks.Drinks;
import com.company.products.snacks.Snacks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class VMMatrixBuilder {
	private static HashMap<String, List<List<Product>>> matrix;

	static {
		matrix = new HashMap<String, List<List<Product>>>();
		List<Product> tanShelf = new ArrayList<Product>();
		List<Product> macnabrdoshShelf = new ArrayList<Product>();
		List<Product> qarahunjShelf = new ArrayList<Product>();

		List<Product> mozhozhShelf = new ArrayList<Product>();
		List<Product> jamonShelf = new ArrayList<Product>();
		List<Product> chechilShelf = new ArrayList<>();

		List<Product> doritosShelf = new ArrayList<>();
		List<Product> cheetosShelf = new ArrayList<>();
		List<Product> rufflesShelf = new ArrayList<>();

		for (int i = 0; i < 2; i++) {
			tanShelf.add(Drinks.TAN);
			macnabrdoshShelf.add(Drinks.MACNABRDOSH);
			qarahunjShelf.add(Drinks.QARAHUNJ);

			mozhozhShelf.add(Snacks.MOZHOZH);
			jamonShelf.add(Snacks.JAMON);
			chechilShelf.add(Snacks.CHECHIL);

			doritosShelf.add(Chipses.DORITOS);
			cheetosShelf.add(Chipses.CHEETOS);
			rufflesShelf.add(Chipses.RUFFLES);
		}

		List<List<Product>> drinksCol = Arrays.asList(tanShelf, macnabrdoshShelf, qarahunjShelf);
		List<List<Product>> snacksCol = Arrays.asList(mozhozhShelf, jamonShelf, chechilShelf);
		List<List<Product>> chipsesCol = Arrays.asList(doritosShelf, cheetosShelf, rufflesShelf);

		matrix.put("A", drinksCol);
		matrix.put("B", snacksCol);
		matrix.put("C", chipsesCol);
	}

	public static HashMap<String, List<List<Product>>> getMatrix() {
		return matrix;
	}
}
