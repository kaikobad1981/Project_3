package com.steppackage3;

import org.openqa.selenium.support.PageFactory;

import com.mypackage_3.MyClass_3;
import com.packutilities.MyUtility;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pagefactory_3.MyPageFactory_3;

public class MyStepdef3 extends MyClass_3 {
	MyPageFactory_3 obj;
	@Given("User successfully open the browser")
	public void user_successfully_open_the_browser() {
		 setUp(); 
		 //method as from base class
		 driver.get("https://www.facebook.com/");
		 obj=PageFactory.initElements(driver,MyPageFactory_3.class);			 
	}
	@Given("User enter the valid email id {string}")
	public void user_enter_the_valid_email_id(String email) {
		MyUtility.getExplicitWait(obj.getEmail(), 10);
		obj.getEmail().sendKeys(email); 
	}
	@Given("User enter the valid password {string}")
	public void user_enter_the_valid_password(String password) {
		obj.getPassword().sendKeys(password); 
	}
	@When("User click on login button")
	public void user_click_on_login_button() {
		obj.getLogin().click();    
	}
	@Then("User varify the account successfully")
	public void user_varify_the_account_successfully() {
		driver.quit();//for Internet Explorer i have to use driver.close();
		   
	}
}
