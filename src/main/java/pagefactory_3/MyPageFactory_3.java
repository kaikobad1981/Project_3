package pagefactory_3;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mypackage_3.MyClass_3; 

public class MyPageFactory_3 extends MyClass_3{
	public MyPageFactory_3() {
			PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//*[@id='email']")
	@CacheLookup
	private WebElement email;
	
	public WebElement getEmail() {
		return email;
	}
	
	@FindBy(xpath="//*[@type='password']")
	@CacheLookup
	private WebElement password;

	public WebElement getPassword() {
		return password;
	}
	
	@FindBy(xpath="//*[@name='login']")	
	@CacheLookup
	private WebElement login;

	public WebElement getLogin() {
		return login;
	}
	
}
