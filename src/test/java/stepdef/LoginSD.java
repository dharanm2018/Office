package stepdef;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import pageobject.LoginPage;

public class LoginSD {



	private WebDriver driver;
	private static LoginPage loginpage;
	
	

	@Given("user enter launch the browser")
	public void user_enter_launch_the_browser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		loginpage= new LoginPage(driver);

	}

	@Given("user enter the url")
	public void user_enter_the_url() {
		driver.get("https://adactinhotelapp.com/index.php");
		driver.manage().window().maximize();
	}

	@When("user Enter the user name and password")
	public void user_enter_the_user_name_and_password() {

		loginpage.getUsername().sendKeys("dharanm2018");
		loginpage.getPassword().sendKeys("Ganga@2024");

	}

	@When("user click on login button")
	public void user_click_on_login_button() {
		loginpage.getLogin().click();
	}

	@Then("user on SearchHotel Page")
	public void user_on_SearchHotel_page() {
		String title = driver.getTitle();
		Assert.assertEquals("Adactin.com - Search Hotel", title);
	}

	@When("user Enter the username {string} and password {string}")
	public void user_enter_the_username_and_password(String string, String string2) {

		WebElement findElement = driver.findElement(By.id("username"));
		findElement.sendKeys(string);
		WebElement findElement2 = driver.findElement(By.id("password"));
		findElement2.sendKeys(string2);
	}
	
	@Then("user on home page")
	public void user_on_home_page() {
	    	String title = driver.getTitle();
	    	System.out.println(title);
	}

	@When("user Enter the invalid username and invalid password")
	public void user_enter_the_invalid_username_and_invalid_password() {
	    System.out.println("user enter invalid credentials");
	}
	@Then("user on Reservation Page")
	public void user_on_Reservation_page() {
		String title = driver.getTitle();
		Assert.assertEquals("Adactin.com - Hotel Reservation System", title);
	}
	@When("user Enter the {string} and  {string}")
	public void user_enter_the_and(String username, String password) {
		WebElement findElement = driver.findElement(By.id("username"));
		findElement.sendKeys(username);
		WebElement findElement2 = driver.findElement(By.id("password"));
		findElement2.sendKeys(password);
	}

	
}
