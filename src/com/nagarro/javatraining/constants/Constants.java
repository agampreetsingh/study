package com.nagarro.javaTraining.constants;

import java.util.ArrayList;
import java.util.Arrays;

public class Constants {
	/* Tax Variables */
	public static final double RAW_TAX = 0.125;
	public static final double MANUFACTURED_TAX = 0.125;
	public static final double MANUFACTURED_SURCHARGE = 0.2;
	public static final double IMPORTED_TAX = 0.10;
	public static final double LOWER_LIMIT = 100;
	public static final double UPPER_LIMIT = 200;

	/* Names and arguments */
	public static final String NAME = "name";
	public static final String PRICE = "price";
	public static final String QUANTITY = "quantity";
	public static final String TYPE = "type";
	public static final ArrayList<String> TYPE_OF_ITEMS = new ArrayList<>(
			Arrays.asList("raw", "imported", "man"));

	/* Exceptions */
	public static final String NAME_NOT_FOUND = "'Name' not found in the input";
	public static final String TYPE_NOT_FOUND = "'Type' not found in the input";
	public static final String PRICE_NOT_FOUND = "'Price' not found in the input";
	public static final String INVALID_FORMAT = "Incorrect input format";
	public static final String INVALID_TYPE = "Incorrect type format";
	public static final String QUANTITY_NOT_DOUBLE = "Incorrect format of Quantity";
	public static final String PRICE_NOT_DOUBLE = "Incorrect format of Price";

	/* IO messages and utilities */
	public static final String INPUT_CHOICE = "Y y";
	public static final String PROMPT_NEXT_INPUT = "Do you want to enter another object? (Y/N)";
	public static final String TOTAL_TAX = "Total Tax";
	public static final String TAX = "Tax";

}
