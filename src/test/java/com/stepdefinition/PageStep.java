package com.stepdefinition;

import java.net.MalformedURLException;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.base.BaseClass;
import com.manager.PageManager;
import com.pages.BookHotel;
import com.pages.BookingConfirmation;

import com.pages.LoginPage;
import com.pages.SearchHotel;
import com.pages.SelectHotel;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.dependency.com.fasterxml.jackson.databind.deser.ValueInstantiator.Gettable;

public class PageStep {
	BaseClass base = new BaseClass();
	PageManager pageManager;
	LoginPage loginPage;
	SearchHotel searchHotel;
	SelectHotel selectHotel;
	BookHotel bookHotel;
	BookingConfirmation bookingConfirmation;
	WebDriver driver;
	
	@Given("User has an adactin account")
	public void user_has_an_adactin_account() throws MalformedURLException {
	 driver = base.getDriverCloud();
		base.loadUrl("http://adactin.com/HotelApp/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  
	}

	@When("User should enter")
	public void user_should_enter(io.cucumber.datatable.DataTable data) {
		List<Map<String, String>> emp = data.asMaps();
		Map<String, String> m = emp.get(0);
		pageManager = PageManager.getInstance();
		loginPage = pageManager.getLoginPage();
		String name = m.get("userName");
		String pass = m.get("passWord");
		base.insert(loginPage.getTxtUserName(), name);
		base.insert(loginPage.getTxtPassWord(), pass);
		
	}

	@When("User should click the login button")
	public void user_should_click_the_login_button() {
	  base.click(loginPage.getLoginBtn());
	}

	@When("User should select")
	public void user_should_select(io.cucumber.datatable.DataTable data) {
		List<Map<String, String>> emp = data.asMaps();
		Map<String, String> m = emp.get(0);
		searchHotel = pageManager.getSearchHotel();
		String loc = m.get("location");
		String hotel = m.get("hotels");
		String room  = m.get("roomType");
		String noOfRoom  = m.get("numberOfRooms");
		String aults   = m.get("adultsPerRoom");
		String childs  = m.get("childrensPerRoom");
		base.selectByValue(searchHotel.getLocation(),loc );
		base.selectByValue(searchHotel.getHotels(),hotel );
		base.selectByValue(searchHotel.getRoomType(),room );
		base.selectByValue(searchHotel.getNoOfRooms(),noOfRoom );
		base.selectByValue(searchHotel.getAdultsPerRoom(), aults);
		base.selectByValue(searchHotel.getChildPerRoom(),childs );
		
		
	}

	@When("User should click the search button")
	public void user_should_click_the_search_button() {
		searchHotel = pageManager.getSearchHotel();
		base.click(searchHotel.getSearchButton());
	}

	@When("user should click the checkbox")
	public void user_should_click_the_checkbox() {
		selectHotel = pageManager.getSelectHotel();
		base.click(selectHotel.getRadioBtnClick());
	
	}

	@When("User should click continue")
	public void user_should_click_continue() {
		selectHotel = pageManager.getSelectHotel();
		base.click(selectHotel.getContinueClick());
	}

	@When("User should enter values")
	public void user_should_enter_values(io.cucumber.datatable.DataTable data) {
		List<Map<String, String>> emp = data.asMaps();
		bookHotel = pageManager.getBookHotel();
		Map<String, String> m = emp.get(0);
		String fname  = m.get("firstName");
		String lname = m.get("lastName");
		String billingAdd = m.get("billingAddress");
		String cardNo = m.get("creditCardNumber");
		String cardType = m.get("creditCardType");
		String eMonth = m.get("expireMonth");
		String eYear = m.get("expireYear");
		String cvv = m.get("cvvNumber");
		
		base.insert(bookHotel.getFirstName(), fname);
		base.insert(bookHotel.getLastName(),lname );
		base.insert(bookHotel.getAddress(),billingAdd );
		base.insert(bookHotel.getCardNum(), cardNo);
		base.selectByValue(bookHotel.getCardType(),cardType );
		base.selectByValue(bookHotel.getExpireMonth(),eMonth );
		base.selectByValue(bookHotel.getExpireYear(),eYear );
	base.insert(bookHotel.getCvvNum(), cvv);
	}
	@When("User should click book now")
	public void user_should_click_book_now() {
		bookHotel = pageManager.getBookHotel();
		base.click(bookHotel.getBookNow());
	}

	@Then("User should print the order id")
	public void user_should_print_the_order_id() throws InterruptedException {
		bookingConfirmation = pageManager.getBookingConfirmation();
		
		String order = base. getAttribute(bookingConfirmation.getOrderNo(), "value");
		Thread.sleep(4000);
		System.out.println(order);
		Thread.sleep(4000);
	}




}