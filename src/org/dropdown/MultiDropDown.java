package org.dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiDropDown
{
	

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.Firefox.driver", "C:\\Users\\User\\Selenium\\Alart\\Driver\\geckodriver.exe");

		WebDriver driver = new FirefoxDriver();

		driver.get("https://demoqa.com/select-menu");
		
		driver.manage().window().maximize();
		
	   //	WebElement menu1 = driver.findElement(By.id("oldSelectMenu"));
		
		//Select select = new Select(menu1);
		
		//select.selectByIndex(3);
		
		WebElement carInfo = driver.findElement(By.id("cars"));
		
		Select select1 = new Select(carInfo);
		
		Thread.sleep(2000);
		
		select1.selectByValue("saab");
		select1.selectByIndex(3);
		
		
		//List<WebElement> allSelectedOptions = select1.getAllSelectedOptions();
		List<WebElement> allSelectedOptions = select1.getAllSelectedOptions();
		
		for (int i = 0; i <allSelectedOptions.size(); i++)
		{
			System.out.println(allSelectedOptions.get(i).getText());
		}
		
		
		//to get the first selected option
		
		WebElement firstSelectedOption = select1.getFirstSelectedOption();
		System.out.println(firstSelectedOption.getText());
		
		///multiple or not
		Thread.sleep(5000);
		
		boolean multiple = select1.isMultiple();
		select1.deselectAll();
			
	}
}
