package com.vitalii.vitaliiFramework2.pages;

import org.openqa.selenium.WebElement;

public class CreateSignUpFormBasicsTab extends BasePage {
	
/*	public CreateSignUpFormBasicsTab() {
		super("create");
	}*/

	String signUpFormName = "//*[@id='activityForm']/div[3]/div/div[2]/div/validation-message/div/span/input";
	String signUpFormDescription = "//*[@id='activityForm']/div[3]/div/div[3]/div/validation-message/div/span/textarea"; 
	String nextButton = "//*[@id='btnGo-setup-compose']";
	String test = "html/body/div[1]/div/section/div[2]/div/div";
	
	public CreateSignUpFormBasicsTab specifySignUpFormName (String name){
		waiters.waitElementIsClickable(signUpFormName);
		type(signUpFormName, name);
		return this;
	}
	
	public CreateSignUpFormSelectLayoutTab clickNextButtonToSelectLayoutTab(){
		waiters.waitElementIsPresent(nextButton);
		click(nextButton);
		return new CreateSignUpFormSelectLayoutTab();
	}
}
