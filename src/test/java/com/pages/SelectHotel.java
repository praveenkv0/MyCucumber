package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class SelectHotel extends BaseClass {
	public SelectHotel() {
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(id="radiobutton_0")
	private WebElement radioBtnClick;
	@FindBy(id="continue")
	private WebElement continueClick;
	
	public WebElement getRadioBtnClick() {
		return radioBtnClick;
	}
	public WebElement getContinueClick() {
		return continueClick;
	}

	public void select() {
		click(getRadioBtnClick());
	

	}
	public void continu() {
click(getContinueClick());
	}
	

}
