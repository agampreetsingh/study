package com.nagarro.javaTraining.dataModels;

import com.nagarro.javaTraining.interfaces.ITaxCalculator;

/**
 * @author agampreetarora
 *
 */
public abstract class Item implements ITaxCalculator {

	// data members
	private String name;
	private double price;
	private double quantity;
	private String type;

	public Item(String name, double price, double quantity, String type) {
		this.price = price;
		this.name = name;
		this.quantity = quantity;
		this.type = type;
	}

	// member functions to access item data
	public String getName() {
		return this.name;
	}

	public double getPrice() {
		return this.price;
	}

	public double getQuanity() {
		return this.quantity;
	}

	public String getType() {
		return this.type;
	}

}
