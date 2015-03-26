package feature.soapui;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/", tags={"@getWeatherByZipcode"},format = {"pretty", "html:build/Cucumber -report", "json:build/Cucumber -json-report.json"})
public class SoapUITest {

}
