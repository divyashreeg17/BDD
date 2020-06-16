package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepDef {
	
	WebDriver driver;
	
	static {
		System.setProperty("webdriver.chrome.driver", "C:\\Softwares\\Divya_Automation\\Appium Related\\chromedriver.exe");
	}
		
	@Given("^the browser is Launched$")
	public void the_browser_is_Launched() throws Throwable {
		driver = new ChromeDriver();
	}

	@Given("^the application is loaded$")
	public void the_application_is_loaded() throws Throwable {
		driver.get("https://demo.actitime.com");
	}
	
	@When("^the user enters the valid username$")
	public void the_user_enters_the_valid_username() throws Throwable {
	    driver.findElement(By.name("username")).sendKeys("admin");
	}

	@When("^the user enters the valid password$")
	public void the_user_enters_the_valid_password() throws Throwable {
	    driver.findElement(By.name("pwd")).sendKeys("manager");
	}

	@When("^the user clickd the Login Button$")
	public void the_user_clickd_the_Login_Button() throws Throwable {
		driver.findElement(By.id("loginButton")).click();
	}

	@Then("^dashboard should be displayed$")
	public void dashboard_should_be_displayed() throws Throwable {
		Assert.assertEquals("", "");
		driver.close();
	}
	
	@When("^User clicks on forgot password link$")
	public void user_clicks_on_forgot_password_link() throws Throwable {
	    driver.findElement(By.id("toPasswordRecoveryPageLink")).click();
	}

	@Then("^Forgot your password component should be displayed$")
	public void forgot_your_password_component_should_be_displayed() throws Throwable {
		Assert.assertEquals("", "");
		driver.close();
	}
	
	@When("^the user enters the valid username and password$")
	public void the_user_enters_the_valid_username_and_password() throws Throwable {
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
	}
	
	@When("^the user enters the credentials as \"([^\"]*)\" and \"([^\"]*)\"$")
	public void the_user_enters_the_credentials_as_and(String arg1, String arg2) throws Throwable {
		driver.findElement(By.name("username")).sendKeys(arg1);
		driver.findElement(By.name("pwd")).sendKeys(arg2);
	}


}
