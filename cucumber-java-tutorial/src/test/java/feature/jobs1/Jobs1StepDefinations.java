package feature.jobs1;
import java.util.List;

import cucumber.api.java.en.And;  
import cucumber.api.java.en.Given;  
import cucumber.api.java.en.Then;  
import cucumber.api.java.en.When;  
import net.gazsi.laszlo.sandbox.Person;  
import org.junit.Assert;
public class Jobs1StepDefinations {
	
	@Given("^you learnt the below technologies$")
	public void you_learnt_the_below_technologies(List<String> technologies) {
	//This will convert it to a list list like this: ["Java", "Selenium", "Cucumber"]
	for (String technology : technologies) {
	System.out.println(technology);
	  }
	}
//Output
	//Java Selenium Cucumber
	@When("^you apply for Job$")
	public void you_apply_for_Job() {
	System.out.println("you apply for Job");
	}

	@Then("^you should get a good job$")
	public void you_should_get_a_good_job() {
	System.out.println("you should get a good job");
	}

}
