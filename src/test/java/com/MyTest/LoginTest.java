package com.MyTest;

import org.testng.annotations.Test;

public class LoginTest {
	
	
	@Test(priority=1,description = "this test is about logout functionality")
	public void LoginTest1() {
		System.out.println("Login is successful");
	}
	@Test(priority=2, description = "this test is about logout functionality")
	public void LogOutTest2() {
		System.out.println("Log out is successful");
	}

}
