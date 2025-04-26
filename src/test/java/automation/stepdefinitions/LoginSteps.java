package automation.stepdefinitions;

import automation.pages.LoginPage;

import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

import static org.junit.Assert.*;


public class LoginSteps{
	WebDriver driver;
	LoginPage loginPage;
	
	 @Given("I launch the Parabank application")
	    public void i_launch_the_parabank_application() {
	        WebDriverManager.chromedriver().setup();
	        driver = new ChromeDriver();
	        driver.get("https://parabank.parasoft.com/parabank/index.htm?ConnType=JDBC");
	        driver.manage().window().maximize();
	        loginPage = new LoginPage(driver);
	    }
	 
	 @When("I login with username {string} and password {string}")
	    public void i_login_with_username_and_password(String username, String password) {
	        loginPage.login(username, password);
	    }
	 
	 @Then("I should see the account overview page")
	    public void i_should_see_the_account_overview_page() {
	        String title = loginPage.getPageTitle();
	        assertTrue(title.contains("ParaBank | Accounts Overview"));
	        //driver.quit();
	    }
	 
	 //@Then("I should see an error message indicating login failure")
	    //public void i_should_see_an_error_message_indicating_login_failure() {
	       // boolean errorVisible = loginPage.isLoginErrorDisplayed();
	        //assertTrue("Login error message not displayed!", errorVisible);
	        //driver.quit();
	    //}

	
}