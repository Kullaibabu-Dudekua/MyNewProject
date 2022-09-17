package com.MyTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebAutomation {

	public static void main(String[] args) {
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.get("https://gmail.com");
		WebElement email=driver.findElement(By.xpath("//input[@type='email']"));
		email.sendKeys("kullaibabu8@gmail.com");
		driver.findElement(By.xpath("//button//span[text()='Next']")).click();
		driver.findElement(By.xpath("//div[@id='password']")).sendKeys("Kullai@341");
		driver.findElement(By.xpath("//button//span[text()='Next']")).click();
		
		}

}
