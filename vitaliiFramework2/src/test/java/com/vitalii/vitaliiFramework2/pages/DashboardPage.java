package com.vitalii.vitaliiFramework2.pages;

public class DashboardPage extends BasePage {
	
	//Locators:
	String activitiesPage = "//a[@href='/#/activities']//span";
	String test = "//*[@id='dashboard']//*[@class='row main-header hide-for-small left' or @id='sideNav']";
	String test2 = "//*@id='sideNav']";
	
/*	public DashboardPage(){
		super("dashboard");
		System.out.println("DASHBOARD PAGE CONSTRUCTOR");
	}*/
	
/*	public DashboardPage(){
		waiters.waitPageToOpen("dashboard");
	}*/
	
	public ActivitiesPage goToActivitiesPage(){
		waiters.fluentWaitIgnoringNoSuchElementExceptionAndElementNotVisibleException(activitiesPage);
		//waiters.waitElementIsPresent(activitiesPage);
		clickJs(activitiesPage);
		return new ActivitiesPage();
	}
}


