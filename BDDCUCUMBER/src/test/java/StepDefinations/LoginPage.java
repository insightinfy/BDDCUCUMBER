package StepDefinations;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPage {
	
	WebDriver driver=new ChromeDriver();

	@Given("i am on login page")
	public void i_am_on_login_page() {
		driver.navigate().to("https://practicetestautomation.com/practice-test-login/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	    
	}


	@When("^user enters(.*) and(.*)$")
	public void user_enters_and(String username, String password) {
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
		
		
	}

	@And("click on login button")
	public void click_on_login_button() {
		driver.findElement(By.xpath("//button[@id='submit']")).click();
	}

	@Then("user redirects to Home page")
	public void user_redirects_to_home_page() {

		driver.getTitle();
		driver.close();
		driver.quit();
	}


}
