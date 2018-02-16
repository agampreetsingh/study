package com.nagarro.javaTraining.dataModels;

import com.nagarro.javaTraining.constants.Constants;

/**
 * @author agampreetarora
 *
 */
public class Imported extends Item {

	private static final String type = "manufactured";

	public Imported(String name, double price, double quantity) {
		super(name, price, quantity, type);
	}

	@Override
	public double calculateTax(double price) {

		double priceAfterTax = Constants.IMPORTED_TAX * price + price;
		int surcharge = 0;
		if (priceAfterTax <= Constants.LOWER_LIMIT) {
			surcharge = 5;
		} else if (priceAfterTax > Constants.LOWER_LIMIT
				&& priceAfterTax <= Constants.UPPER_LIMIT) {
			surcharge = 10;
		} else {
			surcharge = 100;
		}
		double totalTax = priceAfterTax + surcharge;
		return totalTax;
	}

}
