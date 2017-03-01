package com.vitalii.vitaliiFramework2.pages;

import org.openqa.selenium.WebElement;

public class SignUpFormsPage extends BasePage {
	
/*	public SignUpFormsPage() {
		super("subscribe");
	}*/
	
	//Locators:
	
	String createNewSignUpFormButton = "//*[@autotest-id='btn_create_subscribe_form_forms_dashboard']";
	
	public CreateSignUpFormBasicsTab clickCreateSignupFormButton(){
		waiters.waitElementIsPresent(createNewSignUpFormButton);
		click(createNewSignUpFormButton);
		return new CreateSignUpFormBasicsTab();
	}

}
