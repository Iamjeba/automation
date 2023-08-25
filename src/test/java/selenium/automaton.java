package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.github.dockerjava.api.model.Driver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class automaton {
	WebDriver driver;
	@BeforeTest
	public void init() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
	}
	@Test
	public void aTesttitle()
	{
		String ExpectedTitle = "Swag Labs";
		String ActualTitle = driver.getTitle();
		Assert.assertEquals(ActualTitle,ExpectedTitle,"Code Run");
	}
	public void bTestURL() {
		String ExpectUrl = "https://www.saucedemo.com/";
		String ActualUrl = driver.getCurrentUrl();
		Assert.assertEquals(ActualUrl, ExpectUrl,"kmm");
	}

}
