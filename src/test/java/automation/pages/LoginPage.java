package automation.pages;
import org.openqa.selenium.*;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.FindBy;


public class LoginPage{
	WebDriver driver;
	
	@FindBy(name="username")
	WebElement username;
	
	@FindBy(name="password")
	WebElement pass;
	
	@FindBy(xpath = "//input[@value='Log In']")
	WebElement loginButton;
	
	 @FindBy(css = "p.error") // Error message locator
	    WebElement errorMessage;
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
	public void login(String uname, String pwd) {
		
		username.clear();
		username.sendKeys(uname);
		pass.clear();
		pass.sendKeys(pwd);
		loginButton.click();
				
	}
	
	public boolean isLoginErrorDisplayed() {
        return errorMessage.isDisplayed();
    }

    public String getPageTitle() {
        return driver.getTitle();
    }
	
	
	
}
