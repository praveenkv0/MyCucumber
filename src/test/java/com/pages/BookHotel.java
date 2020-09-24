package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class BookHotel extends BaseClass {
	public BookHotel() {
		PageFactory.initElements(driver, this);

	}

	@FindBy(id = "first_name")
	private WebElement firstName;
	@FindBy(id = "last_name")
	private WebElement lastName;
	@FindBy(id = "address")
	private WebElement address;
	@FindBy(id = "cc_num")
	private WebElement cardNum;
	@FindBy(id = "cc_type")
	private WebElement cardType;
	@FindBy(id = "cc_exp_month")
	private WebElement expireMonth;
	@FindBy(id = "cc_exp_year")
	private WebElement expireYear;
	@FindBy(id = "cc_cvv")
	private WebElement cvvNum;
	@FindBy(id = "book_now")
	private WebElement bookNow;

	public WebElement getFirstName() {
		return firstName;
	}

	public WebElement getLastName() {
		return lastName;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getCardNum() {
		return cardNum;
	}

	public WebElement getCardType() {
		return cardType;
	}

	public WebElement getExpireMonth() {
		return expireMonth;
	}

	public WebElement getExpireYear() {
		return expireYear;
	}

	public WebElement getCvvNum() {
		return cvvNum;
	}

	public WebElement getBookNow() {
		return bookNow;
	}

	public void book(String firstName, String lastName, String billingAddress, String creditCard, String cardType,
			String expireMonth, String expireYear, String cvvNumber) {
		insert(getFirstName(), firstName);
		insert(getLastName(), lastName);
		insert(getAddress(), billingAddress);
		insert(getCardNum(), creditCard);
		selectByValue(getCardType(), cardType);
		selectByValue(getExpireMonth(), expireMonth);
		selectByValue(getExpireYear(), expireYear);
		insert(getCvvNum(), cvvNumber);

	}
	
	
		

	public void bookBtn() {
		click(getBookNow());
	}

}
