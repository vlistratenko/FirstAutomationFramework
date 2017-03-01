package com.vitalii.vitaliiFramework2.pages;

public class CreateSignupFormAutorespondersTab extends BasePage {
	
/*	public CreateSignupFormAutorespondersTab() {
		super("compose");
	}*/

	String publisButton = "//*[@id='btnGo-autoresponders-publish']";
	
	public CreateSignupFormPublishedDetailsTab clickPulblishButton(){
		waiters.waitElementIsPresent(publisButton);
		click(publisButton);
		return new CreateSignupFormPublishedDetailsTab();
	}
}
