package stepDefinitions;



import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import Firstproject.E2E.Base;
import Firstproject.E2E.Home;
import Firstproject.E2E.Login;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
public class stepDefinition extends Base{

	WebDriver driver;
	@Given("^Initialize the browser with the \"([^\"]*)\"$")
    public void initialize_the_browser_with_the_something(String strArg1) throws Throwable {
    	driver=initdriver(strArg1);
    }
    @And("^Navigate to \"([^\"]*)\" site$")
    public void navigate_to_something_site(String strArg1) throws Throwable {
        driver.get(strArg1);
    }
    @And("^Click on login button in homepage to land on login page$")
    public void click_on_login_button_in_homepage_to_land_on_login_page() throws Throwable {
        String url=driver.getCurrentUrl();
        System.out.println(url);
        
    }



    @When("^user enters \"([^\"]*)\" and \"([^\"]*)\" and click login$")
    public void user_enters_something_and_something_and_click_login(String strArg1, String strArg2) throws Throwable {
    	Login login=new Login(driver);
		//Actions actions = new Actions(driver);
		//actions.moveToElement(home.login_btn()).click().perform();
		//home.login_btn().click();
		Thread.sleep(2000);
	    login.mobile().sendKeys(strArg1);
		login.password().sendKeys(strArg2);
		Thread.sleep(2000);
		login.proceed().click();
		Thread.sleep(3000);
		
        
    }

    @Then("^Validate the user is successfully logged in$")
    public void validate_the_user_is_successfully_logged_in() throws Throwable {    	
    	Home home = new Home(driver);
    	String name=home.name().getText();
		System.out.println(name);
		Assert.assertEquals("Ananth", name);
	

    }



}