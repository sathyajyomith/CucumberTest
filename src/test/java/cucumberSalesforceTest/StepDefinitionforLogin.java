package cucumberSalesforceTest;

import java.lang.reflect.Method;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import javaUtility.ExtentReportsUtility;
import pOMbase.BaseTest;
import pOMpageshome.HomePage;
import pOMpageslogin.Loginpage;
@Listeners(javaUtility.MyListeners.class)
public class StepDefinitionforLogin extends BaseTest{
//WebDriver driver;
Loginpage loginpage;
HomePage homepage;

@Test
@Before
public void setup() {
	//WebDriverManager.chromedriver().setup();
    //driver=new ChromeDriver();
    //driver.manage().window().maximize();
	//logger.info("Started testscript:" +method.getName());
	//System.out.println("Started testscript:" +method.getName());
	getDriverInstance("chrome");

	//Exreport.startsingletestReport("testcase");
}

	@Given("salesforce application")
	public void salesforce_application() {
		//driver.get("https://login.salesforce.com/");
 gotourl("https://login.salesforce.com/");
	}

	@When("user on {string}")
	public void user_on(String page) {
	  if(page.equalsIgnoreCase("loginpage")) {
		  loginpage=new Loginpage(driver);
	  } else if(page.equalsIgnoreCase("homepage")) {
		  homepage=new HomePage(driver);
	  }
	}

	@When("user enters the username as {string}")
	public void user_enters_the_username_as(String data) {
	 loginpage.enterUsername(data); 
	 System.out.println("username entered");
	}

	@When("user enters  password as {string}")
	public void user_enters_password_as(String data) {
	 loginpage.enterPassword(data); 
	 System.out.println("password entered");
	}

	@When("click in the login button")
	public void click_in_the_login_button() {
	 loginpage.clickLogin() ; 
	 System.out.println("login clicked");
	}

	@Then("verify the page")
	public void verify_the_page() {
		String expected="Content";
		String actual=homepage.getTextfromHomepage();
	    Assert.assertEquals(expected, actual);
	}
@After
public void teardown() {
	driver.close();
}
}
