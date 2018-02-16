package com.nagarro.javaTraining.services;

import com.nagarro.javaTraining.constants.Constants;
import com.nagarro.javaTraining.dataModels.Item;

/**
 * @author agampreetarora
 *
 */
public class Output {

	private String name;
	private String type;
	private double quantity;
	private double tax;
	public Output(Item createdItem) {
		this.name=createdItem.getName();
		this.type=createdItem.getType();
		this.quantity=createdItem.getQuanity();
		this.tax=createdItem.calculateTax(createdItem.getPrice());
	}
	
	public void showTaxDetails()
	{
		
		System.out.println(Constants.NAME + ": " + this.name + ", " + Constants.TYPE + ": " + this.type + ", " + Constants.TAX + ": " + this.tax );
	}
	
	public void showTotalTax()
	{
		
		System.out.println(Constants.TOTAL_TAX + ": "+this.tax*this.quantity);
	}

}
