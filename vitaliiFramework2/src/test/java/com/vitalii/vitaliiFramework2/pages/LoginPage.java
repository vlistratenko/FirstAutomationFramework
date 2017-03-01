package com.vitalii.vitaliiFramework2.pages;

import com.vitalii.vitaliiFramework2.helpers.Configurations;

public class LoginPage extends BasePage {
	
	//Locators
	private final String emailTextField = "//*[@id='email']";
	private final String passwordTextField = "//*[@id='password']";
	private final String loginButton = "//button";
	
	public LoginPage openLoginPage(){
		open(Configurations.getEnvironmentUrl());
		return this;
	}	
	
	public DashboardPage doSuccessfulLogin(String emailAddress, String password){
		openLoginPage();
		if (!isLoggedIn()) {
		removeAtributeWithJs(passwordTextField, "readonly");
		type(emailTextField, emailAddress);
		type(passwordTextField, password);
		click(loginButton); 
		return new DashboardPage();}	
		return new DashboardPage();
	}

	
	public LoginPage doFailedLogin(String emailAddress, String password){
		openLoginPage();
		type(emailTextField, emailAddress);
		type(passwordTextField, password);
		click(loginButton);
		return this;
	}
}
