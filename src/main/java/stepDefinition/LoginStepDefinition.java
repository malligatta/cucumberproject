package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class LoginStepDefinition {
	WebDriver driver;

	@Given("^user is already on login page$")
	public void user_is_already_on_login_page() {
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://ui.freecrm.com/");
	}

	@When("^title of login page is Free CRM$")
	public void title_of_login_page_is_free_crm() {
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals("Cogmento CRM", title);

	}

	@Then("^user enter username and password$")
	public void user_enter_usernameand_password() {

		driver.findElement(By.xpath("//*[@name='email']")).sendKeys("malli13493@gmail.com");
		driver.findElement(By.xpath("//*[@name='password']")).sendKeys("malli@007");
		

	}

	@Then("^user click on contacts$")
	public void user_click_on_contacts() {
	
		driver.findElement(By.xpath("//*[@class='ui fluid large blue submit button']")).click();
		
	/*	WebElement loginbtn = driver.findElement(By.xpath("//*[@class='ui fluid large blue submit button']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", loginbtn); */

	} 

}
