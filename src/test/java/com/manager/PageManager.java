package com.manager;

import com.base.BaseClass;
import com.pages.BookHotel;
import com.pages.BookingConfirmation;

import com.pages.LoginPage;
import com.pages.SearchHotel;
import com.pages.SelectHotel;

public class PageManager extends BaseClass {
	private static PageManager pageManager;
	private LoginPage loginPage;
	private SearchHotel searchHotel;
	private SelectHotel selectHotel;
	private BookHotel bookHotel;
	private BookingConfirmation bookingConfirmation;

	private PageManager() {

	}

	public static PageManager getInstance() {
		return (pageManager == null) ? pageManager = new PageManager() : pageManager;

	}

	public LoginPage getLoginPage() {
		if (getcurrenturl().contains("adactin")) {
			loginPage = null;
			pageManager = null;
		}

		return (loginPage == null) ? loginPage = new LoginPage() : loginPage;
	}

	public SearchHotel getSearchHotel() {
		return (searchHotel == null) ? searchHotel = new SearchHotel() : searchHotel;
	}

	public SelectHotel getSelectHotel() {
		return (selectHotel == null) ? selectHotel = new SelectHotel() : selectHotel;
	}

	public BookHotel getBookHotel() {
		return (bookHotel == null) ? bookHotel = new BookHotel() : bookHotel;
	}

	public BookingConfirmation getBookingConfirmation() {
		return (bookingConfirmation == null) ? bookingConfirmation = new BookingConfirmation() : bookingConfirmation;
	}
}
