package com.nagarro.javaTraining.services;
import java.util.HashMap;
import com.nagarro.javaTraining.constants.Constants;
import com.nagarro.javaTraining.dataModels.*;

/**
 * @author agampreetarora
 *
 */
public  class ItemCreator{
	
	
	
	private String name;
	private double price;
	private double quantity;
	private String type;
	public ItemCreator(HashMap<String, String> userInputData)
	{
		this.name=userInputData.get(Constants.NAME);
		this.price=Double.parseDouble(userInputData.get(Constants.PRICE));
		this.quantity=Double.parseDouble(userInputData.get(Constants.QUANTITY));
		this.type=userInputData.get(Constants.TYPE);
		
		
	}
	Item newItem;
	public Item createNewItem()
	{
		

		if(type.equals("manufactured"))
		{
			newItem=new Manufactured(this.name, this.price, this.quantity);
		}
		else if(type.equals("raw"))
		{
			newItem=new Raw(this.name, this.price, this.quantity);
		}
		else if(type.equals("imported"))
		{
			newItem=new Imported(this.name, this.price, this.quantity);
		}
			return newItem;
	}
	
}
