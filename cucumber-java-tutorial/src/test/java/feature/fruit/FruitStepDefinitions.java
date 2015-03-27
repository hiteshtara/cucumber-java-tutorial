package feature.fruit;
import java.util.List;
import java.util.Map;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;  
import cucumber.api.java.en.Given;  
import cucumber.api.java.en.Then;  
import cucumber.api.java.en.When;  
import net.gazsi.laszlo.sandbox.Person;  
import org.junit.Assert;


public class FruitStepDefinitions {
	@Given("^I go to market$")
	public void goToMarket(){
	System.out.println("I go to market");
	}
	@When("^I check the fruits$")
	public void checkFruits(){
	System.out.println("I check the fruits");
	}
	@Then("^these fruits should have these colors$")
	public void checkColor(DataTable table){

	//This will convert it to a List of map like this:["FruitName": "Mango", "FruitColor":"Yellow"]
	// ["FruitName": "Apple" , "FruitColor":"Red" ]output

//Fruit Name is –Mango and the color is– Yellow
//Fruit Name is –Apple and the color is– Red

//	List<Map<String,String>> data=table.asMaps();
	//System.out.println("Fruit Name is --"+data.get(0).get("FruitName")+" and the color is-- "+data.get(0).get("FruitColor"));
//	System.out.println("Fruit Name is --"+data.get(1).get("FruitName")+" and the color is-- "+data.get(1).get("FruitColor"));
	}

}
