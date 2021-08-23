package org.running;


import org.baseclass.Base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.pojo.Pojo1;
import org.pojo.Pojo2;
import org.pojo.Pojo3;
import org.pojo.Pojo4;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class Stepdef extends Base {
	WebDriver driver;
	Pojo4 pojo;

	@Given("user should be in adactin webpage.")
	public void user_should_be_in_adactin_webpage() {
		giveurl("http://adactinhotelapp.com/");
	}

	@When("To enter the username and password.")
	public void to_enter_the_username_and_password() {
		Pojo1 pojo=new Pojo1();
		WebElement userpassword = pojo.getUserpassword();
		Base.sendkeys(userpassword, "123456");
		WebElement username = pojo.getUsername();
		Base.sendkeys(username, "vijayaragupathy");
		WebElement login = pojo.getLogin();
		Base.click(login);
	}

	@When("To search the hotel.")
	public void to_search_the_hotel() {
		
		Pojo2 pojoo=new Pojo2();
		WebElement location = pojoo.getLocation();
		Base.selectbytext(location, "New York");
		WebElement hotels = pojoo.getHotels();
		Base.selectbyvalue(hotels, "Hotel Cornice");
		WebElement roomtype = pojoo.getRoomtype();
		Base.selectbyIndex(roomtype, 3);
		WebElement submit = pojoo.getSubmit();
		Base.click(submit);	
	}
	@When("To select the hotel.")
	public void to_select_the_hotel() {
		Pojo3 Pojjo=new Pojo3();
		WebElement radiobtn = Pojjo.getRadiobtn();
		Base.click(radiobtn);
		WebElement continuebtn = Pojjo.getContinuebtn();
		Base.click(continuebtn);
	}

	@When("user should enter {string}and{string}and{string}and{string}and{string}.")
	public void user_should_enter_and_and_and_and(String string, String string2, String string3, String string4,
			String string5) {
		
		pojo=new Pojo4();
		WebElement firstname = pojo.getFirstname();
		Base.sendkeys(firstname, string);
		WebElement lastname = pojo.getLastname();
		Base.sendkeys(lastname, string2);
		WebElement address = pojo.getAddress();
		Base.sendkeys(address, string3);
		WebElement ccnum = pojo.getCcnum();
		Base.sendkeys(ccnum, string4);
		WebElement cvvnum = pojo.getCvvnum();
		Base.sendkeys(cvvnum, string5);
		WebElement cctype = pojo.getCctype();
		Base.selectbyIndex(cctype, 3);
		WebElement expmnth = pojo.getExpmnth();
		Base.selectbyvalue(expmnth,"12" );
		WebElement expyear = pojo.getExpyear();
		Base.selectbyvalue(expyear, "2022");
		WebElement booknow = pojo.getBooknow();
		Base.click(booknow);}
	@Then("user confirmation whether booked or not with ID generated.")
	public void user_confirmation_whether_booked_or_not_with_ID_generated() {
		
		System.out.println("success");}
		
		
	

}
