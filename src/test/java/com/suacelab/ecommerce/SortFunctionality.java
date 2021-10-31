package com.suacelab.ecommerce;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.codec.binary.Base32;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import Objects.HomePage;
import Utils.BaseClass;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SortFunctionality extends BaseClass {

	/*
	 * public static void main(String[] ar) {
	 * 
	 * WebDriverManager.chromedriver().setup();
	 * 
	 * WebDriver driver = new ChromeDriver();
	 * 
	 * driver.get("https://www.saucedemo.com/");
	 * 
	 * driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	 * 
	 * driver.manage().window().maximize();
	 * 
	 * 
	 */

	@Test
	public void loginTest() {

		String str = driver.findElement(By.xpath("//div[@id='login_credentials']")).getText();
		// System.out.println(str);

		driver.findElement(By.xpath(HomePage.userName)).sendKeys("standard_user");
		driver.findElement(HomePage.password2).sendKeys("secret_sauce");

		driver.findElement(By.xpath("//input[@id='login-button']")).click();

		Select sle = new Select(driver.findElement(By.xpath("//select[@class='product_sort_container']")));
		sle.selectByIndex(2);

		List<WebElement> ele = driver.findElements(By.xpath("//div[@class='inventory_item_price']"));

		for (int i = 0; i < ele.size() - 1; i++) {

			/*
			 * int ele1 = Integer.parseInt(ele.get(i + 1).getText().replaceAll("$", ""));
			 * int ele2 = Integer.parseInt(ele.get(i).getText().replaceAll("$", ""));
			 */
			/*
			 * int ele1=ele.get(i+1).getText(); int
			 * ele2=Integer.parseInt(ele.get(i).getText().replaceAll("$",""));
			 */
			double ele1 = Double.parseDouble(ele.get(i + 1).getText().replaceAll("\\$", ""));
			double ele2 = Double.parseDouble(ele.get(i).getText().replaceAll("\\$", ""));

			if (ele1 <= ele2) {
				System.out.println("test case is passed");
			} else {
				System.out.println(("test is failed"));
			}

		}

	}

}
