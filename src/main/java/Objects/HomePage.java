package Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import Utils.BaseClass;

public class HomePage extends BaseClass {

	public WebDriver driver;
	public static String userName = "//input[@id='user-name']";
	public static By userName1 = By.xpath("//input[@id='user-name']");

	public static String password = "//input[@id='password']";
	public static By password1 = By.xpath("//input[@id='password']");

	public static By password2 = By.id("password");

	 public  HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, HomePage.class);
	}

}
