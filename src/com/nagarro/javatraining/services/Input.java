package com.nagarro.javaTraining.services;
import java.util.HashMap;
import java.util.Scanner;

import com.nagarro.javaTraining.constants.Constants;
import com.nagarro.javaTraining.exceptions.UserException;

/**
 * @author agampreetarora
 *
 */
public class Input {
	private String userInputLine;
	Scanner scanner=new Scanner(System.in);
	
	public HashMap<String, String> takeInput() throws UserException
	{
		
		this.userInputLine=scanner.nextLine();
		String[] inputStrings=userInputLine.split(" ");
		DataValidator valid=new DataValidator();
		HashMap<String, String> inputData=valid.getValidData(inputStrings);
		return inputData;
		
	}
	

	public boolean promptNewInput()
	{
		System.out.println(Constants.PROMPT_NEXT_INPUT);
		String getInput=scanner.nextLine();
		return Constants.INPUT_CHOICE.contains(getInput);
	}
	
	
	
}
