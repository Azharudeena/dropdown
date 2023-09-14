package org.dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class SingleDropdown {

	public static  void main(String[] args) 
	{
		System.setProperty("webdriver.Firefox.driver", "C:\\Users\\User\\Selenium\\Alart\\Driver\\geckodriver.exe");

		WebDriver driver = new FirefoxDriver();
		driver.get("https://demo.automationtesting.in/Register.html");



		WebElement dropDown = driver.findElement(By.id("Skills"));
		Select select = new Select(dropDown);

		//sect the filed in dropdownbox

		select.selectByVisibleText("AutoCAD");

	}

}
