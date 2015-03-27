package feature.singletonbrowser;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
public class SingletonBrowserStepDefinitions {

	private PageCommon automation=PageCommon.getInstance();
	private WebDriver driver;
	@Given("^I go to \\~([^\"]*)\\~$")
	public void I_go_to_gmail(String url){
	   driver=automation.openBrowser();
	   driver.get("http://gmail.com");
	}
//
	@When("^I enter my username as \\~([^\"]*)\\~$")
	public void I_enter_my_username(String uname){
	  
		driver.findElement(By.id("Email")).sendKeys(uname);
	}

	@And("^I enter my password as \\~([^\"]*)\\~$")
	public void I_enter_my_password(String pwd){
	 
		driver.findElement(By.id("Passwd")).sendKeys(pwd);
	}
	

	@Then("^it should login$")
	public void it_should_login(){
		
		driver.findElement(By.id("signIn")).click();
		Assert.assertTrue("It didnt login", driver.findElements(By.id("gbqfq")).size()!=0);
	}

}