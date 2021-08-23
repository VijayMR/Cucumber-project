package org.baseclass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base{
	protected static WebDriver driver;
	public static void giveurl(String url) {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get(url);}
	
	public static WebElement pushValue(String str,String name) {
		WebElement element=null;
		if(name.equalsIgnoreCase("id")) {
		element= driver.findElement(By.id(str));
		}
		else if (name.equalsIgnoreCase("name")) {
			element=driver.findElement(By.name(str));}
		return element;}
	
	public static void sendkeys(WebElement findElemen,String value) {
		findElemen.sendKeys(value);
	}
	public static void click(WebElement refname) {
		refname.click();
	}
	
	public static void selectbyIndex (WebElement element,int i) {
		 Select select=new Select(element);
		select.selectByIndex(i);
		}
	public static void selectbyvalue(WebElement element1,String args) {
		Select select=new Select(element1);
		select.selectByValue(args);
	}
	public static void selectbytext (WebElement element,String txt) {
			Select select=new Select(element);
			select.selectByValue(txt);
		}
	public static void quit() {
		driver.quit();

	}
}


