package com.MyTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebAutomation1 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://opencart.com");
		// driver.manage().window().maximize();
		
WebElement Register=driver.findElement(By.xpath("//a[text()='Register' and @class='btn btn-black navbar-btn']"));
Register.click();
driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("kullaibabu");
driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Dudekula");
WebElement drpCountry=driver.findElement(By.id("input-country"));
Select select=new Select(drpCountry);
//select.selectByVisibleText("Cuba");
//select.selectByValue("3");
//select.selectByIndex(7);
List<WebElement> CountryOptions=select.getOptions();
for(WebElement Options:CountryOptions) {
	System.out.println(Options.getAttribute("value")+" "+Options.getText());
}

	}

}
