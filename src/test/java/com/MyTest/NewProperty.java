package com.MyTest;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NewProperty {

	public static void main(String[] args) throws IOException, InterruptedException {
		FileInputStream file=new FileInputStream("C:\\Users\\91834\\eclipse-workspace\\MyNewProject\\src\\main\\resources\\config.properties");
Properties properties=new Properties();
properties.load(file);
WebDriverManager.chromedriver().setup();
WebDriver driver =new ChromeDriver();
driver.get(properties.getProperty("url"));
Thread.sleep(3000);
driver.findElement(By.xpath("//a[contains(text(),'Login')]")).click();
Thread.sleep(10000);
driver.findElement(By.xpath("//input[@type='text']")).sendKeys(properties.getProperty("username"));
driver.findElement(By.xpath("//input[@type='password']")).sendKeys(properties.getProperty("password"));
driver.findElement(By.xpath("//div[text()='Login']")).click();
Thread.sleep(3000);
driver.close();

properties.setProperty("testdata", "43970720");
	}

}
