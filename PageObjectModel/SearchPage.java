package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage {
	WebDriver driver;
	
//	SearchPage(WebDriver driver){
//		this.driver = driver;
//	}
//	
//	By bookname = By.xpath("//a[text()='Git Pocket Guide']");
//	By LogoutBtn = By.xpath("//button[text()='Log out']");
//	
//	public String VerifyBookname() {
//		return driver.findElement(bookname).getText();
//	}
//	public void ClickLogout() {
//		driver.findElement(LogoutBtn).click();
//	}

	SearchPage(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[text()='Git Pocket Guide']")
	WebElement bookname;
	
	@FindBy(xpath = "//button[text()='Log out']")
	WebElement LogoutBtn;
	
	public String VeifyBookname() {
		return bookname.getText();
	}
	
	public void ClickLogout() {
		LogoutBtn.click();
	}
	
	
}
