package com.pages;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class BookingConfirmation extends BaseClass {
	public BookingConfirmation() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "order_no")
	private WebElement orderNo;

	@FindBy(id = "search_result_error")
	private WebElement cancelBoking;

	public WebElement getCancelBoking() {
		return cancelBoking;
	}

	@FindBy(id = "my_itinerary")
	private WebElement myItinary;

	@FindBy(id = "order_id_text")
	private WebElement serach;

	@FindBy(id = "search_hotel_id")
	private WebElement btnGo;

	@FindBy(id = "btn_id_351162")
	private WebElement btnCancelOne;

	public WebElement getSerach() {
		return serach;
	}

	public WebElement getBtnGo() {
		return btnGo;
	}

	public WebElement getBtnCancelOne() {
		return btnCancelOne;
	}

	@FindBy(xpath = "//input[contains(@onclick,'cancel_booking')]")
	private List<WebElement> cancelId;

	public WebElement getMyItinary() {
		return myItinary;
	}

	public List<WebElement> getCancelId() {
		return cancelId;
	}

	public WebElement getOrderNo() {
		return orderNo;
	}

	public void confirm() throws InterruptedException {
		String order = getAttribute(orderNo, "value");
		Thread.sleep(4000);
		System.out.println(order);
		Thread.sleep(4000);

	}

	public void cancelBooking() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		click(getMyItinary());

		List<WebElement> id = getCancelId();
		int size = id.size();
		

		WebElement cancel = id.get(size - 1);
		click(cancel);

		driver.switchTo().alert().accept();
		boolean result = getCancelBoking().getText().contains("The booking has been cancelled.");

		System.out.println(result);
	}
	public void cancelOneBooking(String orderid) throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		click(getMyItinary());
		insert(getSerach(), orderid );
		click(getBtnGo());
		click(getBtnCancelOne());
			
		
		driver.switchTo().alert().accept();
		boolean result = getCancelBoking().getText().contains("The booking has been cancelled.");
		
		System.out.println(result);
	}

}
