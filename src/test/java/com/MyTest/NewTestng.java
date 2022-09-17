package com.MyTest;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTestng {
public String baseURL="https://facebook.com";
public String browserPath="C:\\Users\\91834\\eclipse-workspace\\MyNewProject\\src\\Drivers\\chromedriver.exe";
WebDriver driver;
@BeforeTest
public void LaunchBroser() {
	System.out.println("Launch the browser");
	System.setProperty("webdriver.chrome.driver", browserPath);
	driver=new ChromeDriver();
	driver.get(baseURL);
	/*driver.findElement(By.xpath("//input[@id='email']")).sendKeys("8341694475");
	driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("Kullai@341");
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	
	System.out.println("The Page Title "+driver.getTitle());
	driver.quit();*/

}
@Test
public void verifyHomePageTitle() {
	
	 String ExpectedTitle="Facebook – log in or sign up";
	 String ActualTitle=driver.getTitle();
	 Assert.assertEquals(ActualTitle, ExpectedTitle);
	
}
@AfterTest
public void terminateBrowser() {
	driver.close();
	System.out.println("Browser terminated successfully");
}


}

