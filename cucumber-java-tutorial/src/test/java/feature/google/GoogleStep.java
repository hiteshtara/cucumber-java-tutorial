package feature.google;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import junit.framework.Assert;

import com.hascode.tutorial.cucumber.book.Book;
import com.hascode.tutorial.cucumber.book.Library;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import cucumber.api.Format;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import static org.hamcrest.Matchers.containsString;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import cucumber.api.java.en.And; 
public class GoogleStep {

    protected   WebDriver driver;

    
         
    @Given("^The search is Hello World$")
    public void theSearchIsHelloWorld() {
       driver = new HtmlUnitDriver();
        driver.get("http://www.google.co.uk");
        driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Hello World");
    }

    @When("^The Search is performed$")
    public void theSearchIsPerformed() {
        driver.findElement(By.xpath("//input[@name='btnG']")).click();
    }


    @Then("^The browser title should have Hello World$")
    public void theBrowserTitleShouldHaveHelloWorld() {
        assertThat ("Browser title:",driver.getTitle(), containsString("Hello World"));
        driver.quit();
    }
         
}