package stepDefinitions;

import java.net.MalformedURLException;
import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import helpers.DataHelper;

public class Hooks{
    public static WebDriver driver;
    public static HashMap<String,String> map;

    
    @Before
    /**
     * Delete all cookies at the start of each scenario to avoid
     * shared state between tests
     */
    public void openBrowser(Scenario scenario) throws MalformedURLException {
    	List<HashMap<String, String>> datamap = DataHelper.data();
     	System.out.println("Datamap is"+datamap);
     	
     	for(int i=0;i<datamap.size();i++){
     		if(datamap.get(i).get("Test Case Name").equals(scenario.getName())){
     			map=datamap.get(i);
     		}
     	}
     	
    	System.out.println("Called openBrowser");
    	System.setProperty("webdriver.chrome.driver", "./lib/chromedriver.exe");
    	driver = new ChromeDriver();
    	driver.manage().deleteAllCookies();
    	driver.manage().window().maximize();
    }

     
    @After
    /**
     * Embed a screenshot in test report if test is marked as failed
     */
    public void embedScreenshot(Scenario scenario) {
       
        if(scenario.isFailed()) {
        try {
        	 scenario.write("Current Page URL is " + driver.getCurrentUrl());
//            byte[] screenshot = getScreenshotAs(OutputType.BYTES);
            byte[] screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
            scenario.embed(screenshot, "image/png");
        } catch (WebDriverException somePlatformsDontSupportScreenshots) {
            System.err.println(somePlatformsDontSupportScreenshots.getMessage());
        }
        
        }
        driver.quit();
        
    }
    
}