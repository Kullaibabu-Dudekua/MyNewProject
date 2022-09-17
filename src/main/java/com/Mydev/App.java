package com.Mydev;

import java.util.ResourceBundle;

public class App {
	
	public int userLogin(String In_user,String In_pwd ) {
		ResourceBundle rb=ResourceBundle.getBundle("C:\\Users\\91834\\eclipse-workspace\\MyNewProject\\src\\main\\resources\\config.properties");
	String userName=rb.getString("username");
	String pwd=rb.getString("password");
	if(In_user.equals(userName) && In_pwd.equals(pwd))
	{
		return 1;
	}
	else
		return 0;
	}

}
