package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
//	WebDriver driver;
	
	private static LoginPage loginInstance;
	
	private LoginPage() {
		
	}
	
	public LoginPage(WebDriver driver) {

		PageFactory.initElements(driver, this);
	}
	
	public static LoginPage getInstance() {
		if (loginInstance==null) {
			loginInstance=new LoginPage();
			
		}
		return loginInstance;
	}
	
@FindBy(id="username")
private WebElement username;

@FindBy(id="password")
private WebElement password;

@FindBy(id="login")
private WebElement login;

public WebElement getUsername() {
	return username;
}

public WebElement getPassword() {
	return password;
}

public WebElement getLogin() {
	return login;
}

public void doLogin(String user, String pass) {
	getUsername().sendKeys(user);
	getPassword().sendKeys(pass);
	getLogin().click();
}
}
