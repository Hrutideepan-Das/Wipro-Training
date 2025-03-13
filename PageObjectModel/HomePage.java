package PageObjectModel;

import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	WebDriver driver;
	
	HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
//	By LoginBtn = By.id("login");
//	public void ClickLogin() {
//		driver.findElement(LoginBtn).click();
//	}
	
	@FindBy(xpath = "//button[text()='Login']")
	WebElement loginBtn;
	
	public void ClickLogin() {
		loginBtn.click();
	}

}
