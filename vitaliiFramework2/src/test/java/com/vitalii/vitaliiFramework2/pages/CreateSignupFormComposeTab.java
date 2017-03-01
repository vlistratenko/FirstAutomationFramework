package com.vitalii.vitaliiFramework2.pages;

public class CreateSignupFormComposeTab extends BasePage {
	
/*	public CreateSignupFormComposeTab() {
		super("compose");
	}*/

	String nextButton = "//*[@id='btnGo-compose-autoresponders']";
	
	public CreateSignupFormAutorespondersTab clickNextButtonToAutorespondersTab(){
		waiters.waitElementIsVisible(nextButton);
		waiters.waitElementIsPresent(nextButton);
		click(nextButton);
		return new CreateSignupFormAutorespondersTab();
	}
	


}
