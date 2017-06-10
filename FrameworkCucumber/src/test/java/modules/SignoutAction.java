package modules;
import helpers.Log;
import pageObjects.AutomationHomePage;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;

import java.util.HashMap;
import java.util.List;
public class SignoutAction {
	public static void Execute(WebDriver driver,HashMap<String,String> map) throws Exception{
		AutomationHomePage.sign_out.click();
		Log.info("Sign out is performed");
		Reporter.log("Sign out is performed");
	}
}
