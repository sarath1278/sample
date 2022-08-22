package com.stepdefinition;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Loginstep {
	WebDriver driver;

	@Given("User is on Adactin page")
	public void user_is_on_Adactin_page() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();

	}

	@When("User should perform login {string}, {string}")
	public void user_should_perform_login(String name, String pass) {

		WebElement userName = driver.findElement(By.id("username"));
		userName.sendKeys(name);
		WebElement passwd = driver.findElement(By.id("password"));
		passwd.sendKeys(pass);
		WebElement btn = driver.findElement(By.name("login"));
		btn.click();
	}

	@When("User should Search Hotels {string}, {string}, {string}, {string}, {string}, {string} , {string},and{string}")
	public void user_should_Search_Hotels_and(String Location, String Hotels, String RoomType, String NumberofRooms,
			String CheckInDate, String CheckOutDate, String AdultsPerRoom, String ChildrensPerRoom) {
		WebElement element = driver.findElement(By.id("location"));
		element.sendKeys(Location);

		WebElement element2 = driver.findElement(By.id("hotels"));
		element2.sendKeys(Hotels);

		WebElement element3 = driver.findElement(By.id("room_type"));
		element3.sendKeys(RoomType);

		WebElement element4 = driver.findElement(By.id("room_nos"));
		element4.sendKeys(NumberofRooms);

		WebElement clear1 = driver.findElement(By.id("datepick_in"));
		clear1.clear();
		WebElement element5 = driver.findElement(By.id("datepick_in"));
		element5.sendKeys(CheckInDate);

		WebElement clear2 = driver.findElement(By.id("datepick_out"));
		clear2.clear();
		WebElement element6 = driver.findElement(By.id("datepick_out"));
		element6.sendKeys(CheckOutDate);

		WebElement element7 = driver.findElement(By.id("adult_room"));
		element7.sendKeys(AdultsPerRoom);

		WebElement element8 = driver.findElement(By.id("child_room"));
		element8.sendKeys(ChildrensPerRoom);
		WebElement element9 = driver.findElement(By.id("Submit"));
		element9.click();
	}

	@When("User should Select Hotel")
	public void user_should_Select_Hotel() {
		WebElement rButton = driver.findElement(By.id("radiobutton_0"));
		rButton.click();

		WebElement btnCont = driver.findElement(By.id("continue"));
		btnCont.click();

	}

	@When("User should Book Hotel {string}, {string}, {string}, {string},{string}, {string},{string},and{string}")
	public void user_should_Book_Hotel_and(String FirstName, String LastName, String BillingAddress,
			String CreditCardNumber, String CreditCardType, String ExpiryMonth, String ExpiryYear, String CVVNumber) {
		WebElement fname = driver.findElement(By.id("first_name"));
		fname.sendKeys(FirstName);

		WebElement lname = driver.findElement(By.id("last_name"));
		lname.sendKeys(LastName);

		WebElement bAddress = driver.findElement(By.id("address"));
		bAddress.sendKeys(BillingAddress);

		WebElement ccNum = driver.findElement(By.id("cc_num"));
		ccNum.sendKeys(CreditCardNumber);

		WebElement ccType = driver.findElement(By.id("cc_type"));
		ccType.sendKeys(CreditCardType);

		WebElement expmonth = driver.findElement(By.id("cc_exp_month"));
		expmonth.sendKeys(ExpiryMonth);

		WebElement expyear = driver.findElement(By.id("cc_exp_year"));
		expyear.sendKeys(ExpiryYear);

		WebElement cvvnum = driver.findElement(By.id("cc_cvv"));
		cvvnum.sendKeys(CVVNumber);

		WebElement booknow = driver.findElement(By.id("book_now"));
		booknow.click();

	}

	@Then("User should verify success msg")
	public void user_should_verify_success_msg() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement orderno = driver.findElement(By.id("order_no"));
		String text = orderno.getAttribute("value");
		System.out.println(text);
	}
}
