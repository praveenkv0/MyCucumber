package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class LoginPage extends BaseClass{
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "username")
	private WebElement txtUserName;
	@FindBy(id = "password")
	private WebElement txtPassWord;
	@FindBy(id = "login")
	private WebElement loginBtn;

	public WebElement getTxtUserName() {
		return txtUserName;
	}

	public WebElement getTxtPassWord() {
		return txtPassWord;
	}

	public WebElement getLoginBtn() {
		return loginBtn;
	}
	
	public void log(String names,String passes) {
		insert(txtUserName, names);
		insert(txtPassWord, passes);
		click(loginBtn);

}
}

