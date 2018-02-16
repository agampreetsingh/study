package com.nagarro.javaTraining.application;

import java.util.HashMap;
import com.nagarro.javaTraining.dataModels.Item;
import com.nagarro.javaTraining.exceptions.UserException;
import com.nagarro.javaTraining.services.Input;
import com.nagarro.javaTraining.services.ItemCreator;
import com.nagarro.javaTraining.services.Output;

/**
 * @author agampreetarora
 *
 */
public class Application {

	public static void main(String[] args) {

		Input userInput;
		do {
			userInput = new Input();
			try {

				/* Store the user input in a HashMap */
				HashMap<String, String> userInputData = userInput.takeInput(); // returns only validated data

				/* Creates a new item with the right type */
				ItemCreator itemCreator = new ItemCreator(userInputData);
				Item createdItem = itemCreator.createNewItem(); 				// a utility function to initialize the item

				/* To use output functions in Output service */
				Output displayResult = new Output(createdItem);
				displayResult.showTaxDetails();

			} catch (UserException e) {
				System.out.println(e.getMessage());
			}

		} while (userInput.promptNewInput());

	}
}
