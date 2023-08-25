package selenium;


import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Testing1 {
	public static void main(String[]args) throws InterruptedException {
     
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		//String ExpectedTitle="Swag Labs";
		driver.get("https://www.saucedemo.com/");
		//driver.navigate().to("https://www.saucedemo.com/");
		
		driver.manage().window().maximize();
		Thread.sleep(3000);
		//driver.navigate().refresh();
		//driver.close();
		//String ActualTitle=driver.getTitle();
		//System.out.println(ActualTitle);
		//if (ActualTitle.equals(ExpectedTitle))
		//{
		//	System.out.println("Title Matched");
		//}
		//else
		//{
			//System.out.println("Title doesn't matched");
		//}
		//Assert.assertEquals(ActualTitle,ExpectedTitle,"Condition true");
	driver.findElement(By.id("user-name")).sendKeys("standard_user");
	driver.findElement(By.id("password")).sendKeys("secret_sauce");	
	driver.findElement(By.id("login-button")).click();
//relative path
	driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']")).click();
	//css format
	Thread.sleep(3000);
	driver.findElement(By.cssSelector("button#remove-sauce-labs-backpack")).click();
	
	//radio button
		/*WebElement radiobutton=driver.findElement(By.id("male"));
		radiobutton.click();
	     assert radiobutton.isSelected();
	     System.out.println(radiobutton.isSelected());
	     radiobutton.isEnabled();
	     System.out.println(radiobutton.isEnabled());
	     
	     //DropDown
	     WebElement testDropDown = driver.findElement(By.id("option"));
	     Select dropdown = new Select(testDropDown);
	     dropdown.selectByIndex(2);
	     */
	     
	}
}