package com.MyTest;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.Mydev.App;

public class MyAppTest{
	@Test
	public void testLogin1() {
		App myapp=new App();
		Assert.assertEquals(0,myapp.userLogin("abc", "abc&123"));
		}
	@Test
	
	public void testLogin2() {
		App myapp=new App();
		Assert.assertEquals(1,myapp.userLogin("abc", "abc&123"));
	}

}
