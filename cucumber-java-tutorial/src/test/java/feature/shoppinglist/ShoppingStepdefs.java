package feature.shoppinglist;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.List;

import com.edu.shop.ShoppingList;

import static org.junit.Assert.assertEquals;

public class ShoppingStepdefs {
   private StringBuilder printedList; 
   private final ShoppingList shoppingList = new ShoppingList();
   
   
   
   @Given("^a shopping list:$")
   public void a_shopping_list(List<ShoppingItem> items) throws Throwable {
       for (ShoppingItem item : items) {
           shoppingList.addItem(item.name, item.count);
       }
   }
   @When("^I print that list$")
   public void I_print_that_list() throws Throwable {
       printedList = new StringBuilder();
       shoppingList.print(printedList);
   }
   @Then("^it should look like:$")
   public void it_should_look_like(String expected) throws Throwable {
       assertEquals(expected, printedList.toString());
   }
   public static class ShoppingItem {
	      private String name;
	      private Integer count;
	  }
}