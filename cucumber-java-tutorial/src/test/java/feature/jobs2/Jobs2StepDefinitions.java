package feature.jobs2;
import java.util.List;

import cucumber.api.java.en.And;  
import cucumber.api.java.en.Given;  
import cucumber.api.java.en.Then;  
import cucumber.api.java.en.When;  
import net.gazsi.laszlo.sandbox.Person;  
import org.junit.Assert;
public class Jobs2StepDefinitions {
	
	@Given("^you learnt the below technologies respective cities$")
	public void you_learnt_the_below_technologies(List<List<String>> technologies) {
	//This will convert it to a list of list of string list like this:[["Java", "Hyderabad"], ["Selenium", "Pune"], ["Cucumber", "Bangalore"]]
	for (List<String> list : technologies) {
	for (String data : list) {
	System.out.println(data);
	}
	System.out.println("----------");
	}

	}
//Output
//	Java
//	Hyderabad
//	———-
//	Selenium
	//Pune
//	———-
//	Cucumber
//	Bangalore
	@When("^you apply for Job$")
	public void you_apply_for_Job() {
	System.out.println("you apply for Job");
	}
	@Then("^you should get a good job$")
	public void you_should_get_a_good_job() {
	System.out.println("you should get a good job");
	}
}
