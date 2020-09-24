package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class SearchHotel extends BaseClass {
	public SearchHotel() {
		PageFactory.initElements(driver, this);
	}
		@FindBy(id="location")
		private WebElement location;
		@FindBy(id="hotels")
		private WebElement hotels;
		@FindBy(id="room_type")
		private WebElement roomType;
		@FindBy(id="room_nos")
		private WebElement noOfRooms; 
		@FindBy(id="datepick_in")
		private WebElement checkInDate; 
		@FindBy(id="datepick_out")
		private WebElement checkOutDate; 
		@FindBy(id="adult_room")
		private WebElement adultsPerRoom;
		public WebElement getLocation() {
			return location;
		}
		public WebElement getHotels() {
			return hotels;
		}
		public WebElement getRoomType() {
			return roomType;
		}
		public WebElement getNoOfRooms() {
			return noOfRooms;
		}
		public WebElement getCheckInDate() {
			return checkInDate;
		}
		public WebElement getCheckOutDate() {
			return checkOutDate;
		}
		public WebElement getAdultsPerRoom() {
			return adultsPerRoom;
		}
		public WebElement getChildPerRoom() {
			return childPerRoom;
		}
		public WebElement getSearchButton() {
			return searchButton;
		}
		@FindBy(id="child_room")
		private WebElement childPerRoom; 
		@FindBy(id="Submit")
		private WebElement searchButton; 
		
		
		public void searching(String loc, String hotelName, String roomType, String noOfRooms,
				String adultsPerRoom, String childrens) {
			selectByValue(getLocation(), loc);
			selectByValue(getHotels(), hotelName);
			selectByValue(getRoomType(), roomType);
			selectByValue(getNoOfRooms(), noOfRooms);
			selectByValue(getAdultsPerRoom(), adultsPerRoom);
			selectByValue(getChildPerRoom(), childrens);
		

}	
		public void btn() {
click(getSearchButton());
		}

}




