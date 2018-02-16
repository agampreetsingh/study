package com.nagarro.javaTraining.dataModels;

import com.nagarro.javaTraining.constants.Constants;

/**
 * @author agampreetarora
 *
 */
public class Raw extends Item {

	private static final String type = "raw";

	public Raw(String name, double price, double quantity) {
		super(name, price, quantity, type);
	}

	@Override
	public double calculateTax(double price) {
		double totalTax = Constants.RAW_TAX * price + price;
		return totalTax;
	}

}
