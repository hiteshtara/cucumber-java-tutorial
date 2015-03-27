package feature.singletonbrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PageCommon {

	private static PageCommon instance=null;
	private WebDriver driver;
	private WebDriver Mozilla=null;
	
	private PageCommon(){
		
	}
	//Create single instance of WebDriver to run more than one scenario in cucumber
	public WebDriver openBrowser(){
		if(Mozilla==null){
		driver=new FirefoxDriver();
		Mozilla = driver;
		}else if(Mozilla!=null){
			driver=Mozilla;
		}
		driver.manage().window().maximize();
		return driver;
	}
	
	public static PageCommon getInstance(){
		if(instance==null){
			instance = new PageCommon();
		}
		return instance;
	}
	

}