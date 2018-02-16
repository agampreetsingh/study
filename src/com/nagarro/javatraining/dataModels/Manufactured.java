package com.nagarro.javaTraining.dataModels;

import com.nagarro.javaTraining.constants.Constants;

/**
 * @author agampreetarora
 *
 */
public class Manufactured extends Item {
	private static final String type = "manufactured";

	public Manufactured(String name, double price, double quantity) {
		super(name, price, quantity, type);
	}

	@Override
	public double calculateTax(double price) {

		double totalTax = Constants.MANUFACTURED_TAX * price
				+ Constants.MANUFACTURED_SURCHARGE
				* (price + Constants.MANUFACTURED_TAX * price) + price;
		return totalTax;
	}

}
