package com.vitalii.vitaliiFramework2.pages;

import org.openqa.selenium.WebElement;

public class ActivitiesPage extends BasePage {
	
/*	public ActivitiesPage(){
		super("activities");
	}*/
	
	//Locators:
	String subscribePageTab = "//*[@autotest-id='SUBSCRIBE'][1]";
	String test = "html/body/div[1]/div/section/div[2]/div/div/div/activities-tabs/div/div";
	
	public SignUpFormsPage goToSignUpFormsPage(){
		waiters.fluentWaitIgnoringNoSuchElementExceptionAndElementNotVisibleException(subscribePageTab);
		//waiters.waitElementIsPresent(subscribePageTab);
		click(subscribePageTab);
		return new SignUpFormsPage();
	}
}
