package UIAutomationSteps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;

public class Steps  {
	WebDriver driver;
	@Given("I enter valid username, password and click login button")
	public void i_enter_valid_username_password_and_click_login_button() {
		System.setProperty("webdriver.chrome.driver", "/Users/Mustafa/Selenium/chromedriver");
		driver=new ChromeDriver();
		driver.manage().window().fullscreen();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
		driver.findElement(By.cssSelector("input#password")).sendKeys("secret_sauce");
		driver.findElement(By.cssSelector("input.btn_action")).click();
	}

	@Given("I add and remove items to the shopping cart")
	public void i_add_and_remove_items_to_the_shopping_cart() {
		WebElement sortOptions = driver.findElement(By.cssSelector("select[class='product_sort_container']"));
		Select select = new Select(sortOptions);
		select.selectByValue("lohi");
		driver.findElement(By.cssSelector("button[class='btn_primary btn_inventory']")).click();
		driver.findElement(By.cssSelector("button[class='btn_primary btn_inventory']")).click();
	    
	}

	@Given("I check items and complete checkout")
	public void i_check_items_and_complete_checkout() {
		driver.findElement(By.className("shopping_cart_container")).click();
		driver.findElement(By.linkText("CHECKOUT")).click();
		driver.findElement(By.id("first-name")).sendKeys("Mustafa");
		driver.findElement(By.id("last-name")).sendKeys("Ozturk");
		driver.findElement(By.id("postal-code")).sendKeys("21048");
		driver.findElement(By.cssSelector("input[value='CONTINUE']")).click();
		
		//String revised2=driver.findElement(By.xpath("//a[@id='item_4_title_link']")).getText();
		//Assert.assertEquals("Sauce Labs Backpack",revised2) ;
		
		driver.findElement(By.linkText("FINISH")).click();
		driver.close();
}

}

