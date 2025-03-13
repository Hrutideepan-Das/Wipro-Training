package PageObjectModel;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestClass {
	
	WebDriver driver;
	HomePage hp;
	LoginPage lp;
	SearchPage sp;
	
	@BeforeTest
	public void OpenBrowser() {
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		 driver.get("https://demoqa.com/books");
		 driver.manage().window().maximize();
	}

	@AfterTest
	public void CloseBrowser( ) {
		driver.close();
	}
	
	@Test
	public void EnterToLoginPage() {
		hp = new HomePage(driver);
		hp.ClickLogin();
	}
	@Test
	public void ValidateLogin(){
		lp = new LoginPage(driver);
		lp.EnterUserName("Hruti");
		lp.EnterPassword("Hruti@0054");
		lp.ClickLogin();
	}
	@Test
	public void CheckBookname() {
		sp = new SearchPage(driver);
		String expected = "Git Pocket Guide";
		String actual = sp.VeifyBookname();
		Assert.assertEquals(actual, expected, "Book not found");
	}
	@Test
	public void Logout() {
		sp.ClickLogout();
	} 
	
}
