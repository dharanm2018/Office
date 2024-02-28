package stepdef;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import pageobject.LoginPage;

public class SearchHotelSD {
	
	public static WebDriver driver;
	LoginPage login;
	
	@Given("user already logged into application")
	public void user_already_logged_into_application(DataTable dataTable) {
		// Write code here that turns the phrase above into concrete actions
		// For automatic transformation, change DataTable to one of
		// E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
		// Map<K, List<V>>. E,K,V must be a String, Integer, Float,
		// Double, Byte, Short, Long, BigInteger or BigDecimal.
		//
		// For other transformations you can register a DataTableType.
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		login= new LoginPage(driver);
		driver.get("https://adactinhotelapp.com/index.php");
		driver.manage().window().maximize();
		
//		login.doLogin("dharanm2018", "Ganga@2024");
		
		List<Map<String, String>> asMap = dataTable.asMaps();
		if (!asMap.isEmpty()) {
		String user = asMap.get(0).get("username");
		System.out.println(user);
		String pass = asMap.get(0).get("password");
		System.out.println(pass);
		LoginPage login=new LoginPage(driver);
		login.doLogin(user, pass);
		System.out.println("Driver opened for Search Hotel Login");
		}
	
	}
	
	
	@When("user gets the title of searchPage")
	public void user_gets_the_title_of_search_page() {
		String title = driver.getTitle();
		System.out.println(title);
	    
	}
	@Given("user is on search page")
	public void user_is_on_search_page() {
		
	 String currentUrl = driver.getCurrentUrl();
	 System.out.println(currentUrl);
	}
	@Then("validating all the criteria")
	public void validating_all_the_criteria(DataTable dataTable) {
		List<String> asList = dataTable.asList();

		
		
		
	   
	}

	@Then("page title should be {string}")
	public void page_title_should_be(String string) {
	  String title = driver.getTitle();
	 Assert.assertEquals(string, title);
	}
	@And("Search criteria should be {int}")
	public void search_criteria_should_be(int int1) {
		int count =0;
		List<WebElement> findElements = driver.findElements(By.xpath("//form[@id='search_form']/table/tbody/tr"));
		int size = findElements.size();
		System.out.println(size);
		
		Assert.assertEquals(10, size);
		
		
	    
	}





}
