package com.vitalii.vitaliiFramework2.pages;

public class CreateSignUpFormSelectLayoutTab extends BasePage {
	
/*	public CreateSignUpFormSelectLayoutTab() {
		super("compose");
	}*/

	String heroSideBarLayout = "//*[@id='activityForm']/div[3]/div/div[1]/div/div[1]/div[4]/div[2]/div/img";
	String nextButton = "//*[@id='btnCompose']";
	
	public CreateSignUpFormSelectLayoutTab selectLayout(){
		waiters.waitElementIsPresent(heroSideBarLayout);
		click(heroSideBarLayout);
		return this;
		
	}
	
	public CreateSignupFormComposeTab clickNextButtonToComposeTab(){
		waiters.waitElementIsPresent(nextButton);
		waiters.waitElementIsVisible(nextButton);
		click(nextButton);
		return new CreateSignupFormComposeTab();
		
	}

}
