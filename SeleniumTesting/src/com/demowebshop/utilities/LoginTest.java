package com.demowebshop.utilities;

public class LoginTest implements Login{

	@Override
	public void LoginToApp(String username, String password) {
		System.out.println("Username is "  +username);
		System.out.println("Password is "  +password);
		
	}
	
	public static void main(String[] args) {
		LoginTest login = new LoginTest();
		login.LoginToApp("Ramesh1981", "sample");
	}

}
