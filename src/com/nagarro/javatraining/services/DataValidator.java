package com.nagarro.javaTraining.services;

import java.util.HashMap;

import com.nagarro.javaTraining.constants.Constants;
import com.nagarro.javaTraining.exceptions.UserException;

public class DataValidator {

	public HashMap<String, String> getValidData(String[] input)
			throws UserException {
		HashMap<String, String> returnData = new HashMap<String, String>();

		isNamePresent(input);					//check if name is present
		createDataMap(input, returnData);		//a utility function to create a HashMap with user input
		isNameValid(returnData);				//validate name
		isTypeValid(returnData);				//validate Type
		isPriceValid(returnData);				//validate Price
		isQuantityValid(returnData);			//validate Quantity
		return returnData;
	}

	private void isQuantityValid(HashMap<String, String> returnData)
			throws UserException {
		if (returnData.containsKey(Constants.QUANTITY)) {
			try {
				Double.parseDouble(returnData.get(Constants.QUANTITY));
			} catch (NumberFormatException e) {
				throw new UserException(Constants.QUANTITY_NOT_DOUBLE);
			}
		}
	}

	private void isPriceValid(HashMap<String, String> returnData)
	throws UserException {
		
		putDefaultQuantity(returnData); // validate default quantity if not present

		if (returnData.containsKey(Constants.PRICE)) {
			try {
				Double.parseDouble(returnData.get(Constants.PRICE));
			} catch (NumberFormatException e) {
				throw new UserException(Constants.PRICE_NOT_DOUBLE);
			}
		} else
			throw new UserException(Constants.PRICE_NOT_FOUND);
	}

	private void isTypeValid(HashMap<String, String> returnData)
			throws UserException {
		
		if (returnData.containsKey(Constants.TYPE)) {
			if (!Constants.TYPE_OF_ITEMS.contains(returnData
					.get(Constants.TYPE))) {
				throw new UserException(Constants.INVALID_TYPE);
			}
		} else
			throw new UserException(Constants.TYPE_NOT_FOUND);
	}

	private void putDefaultQuantity(HashMap<String, String> returnData) {
		if (!returnData.containsKey(Constants.QUANTITY)) {
			returnData.put(Constants.QUANTITY, "1");
		}
	}

	private void isNameValid(HashMap<String, String> returnData)
			throws UserException {
		if (returnData.containsKey(Constants.NAME)) {
			returnData.get(Constants.NAME);
		} else
			throw new UserException(Constants.NAME_NOT_FOUND);
	}

	private void createDataMap(String[] input,
			HashMap<String, String> returnData) {
		for (int i = 0; i < input.length; i++) {

			switch (input[i]) {
			case Constants.NAME:
				returnData.put(Constants.NAME, input[i + 1]);
				break;
			case Constants.PRICE:
				returnData.put(Constants.PRICE, input[i + 1]);
				break;
			case Constants.QUANTITY:
				returnData.put(Constants.QUANTITY, input[i + 1]);
				break;
			case Constants.TYPE:
				returnData.put(Constants.TYPE, input[i + 1]);

				break;
			}
		}
	}

	private void isNamePresent(String[] input) throws UserException {
		if (!input[0].equals(Constants.NAME)) {
			throw new UserException(Constants.NAME_NOT_FOUND);
		}
	}
}
