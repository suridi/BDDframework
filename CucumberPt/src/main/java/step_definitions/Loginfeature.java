package step_definitions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Loginfeature {

	WebDriver driver= new ChromeDriver() ;

@Given("^User is on fb home page$")
public void user_is_on_fb_home_page()  {
    // Write code here that turns the phrase above into concrete actions
	driver.manage().window().maximize();
	driver.navigate().to("https://www.facebook.com/");
   
}

@When("^User authenticates on Login page$")
public void user_authenticates_on_Login_page()  {
    // Write code here that turns the phrase above into concrete actions
	driver.findElement(By.id("email")).sendKeys("jureddi@gmail.com");
	driver.findElement(By.id("pass")).sendKeys("Akhila@16");
	driver.findElement(By.xpath("//input[@type='submit' and @value='Log In']")).click();
    
}

@Then("^User should be able to login$")
public void user_should_be_able_to_login()  {
    // Write code here that turns the phrase above into concrete actions
	String title = driver.findElement(By.xpath(".//*[@id='navItem_100001891987076']/a/div")).getText();
	Assert.assertEquals("Test Passed" , "SureshKumar Jureddi", title);
   

}
}