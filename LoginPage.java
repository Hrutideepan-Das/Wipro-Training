package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;
	
//	LoginPage(WebDriver driver){
//		this.driver = driver;
//	}
//	By username = By.id("userName");
//	By password = By.id("password");
//	By LoginBtn = By.xpath("//button[text()='Login']");
//	public void EnterUsername(String str) {
//		driver.findElement(username).sendKeys(str);
//	}
//	public void EnterPassword(String pwd) {
//		driver.findElement(password).sendKeys(pwd);
//	}
//	public void ClickLogin() {
//		driver.findElement(LoginBtn).click();
//	}

	
	LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "userName")
	WebElement username;
	
	@FindBy(id = "password")
	WebElement passwordElement;
	
	@FindBy(xpath = "//button[text()='Login']")
	WebElement loginBtn;
	
	public void EnterUserName(String usr) {
		username.sendKeys(usr);
	}
	
	public void EnterPassword(String pwd) {
		passwordElement.sendKeys(pwd);
	}
	
	public void ClickLogin() {
		loginBtn.click();
	}
}
