package UITesting;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class UIAutomation {
public static void main(String[] args) { 
		
	
	System.setProperty("webdriver.chrome.driver", "/Users/Mustafa/Selenium/chromedriver");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().fullscreen();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.get("https://www.saucedemo.com/");	
	
	// LOGIN
	driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
	driver.findElement(By.cssSelector("input#password")).sendKeys("secret_sauce");
	driver.findElement(By.cssSelector("input.btn_action")).click();
	
	//SORT THE ITEMS
	WebElement sortOptions = driver.findElement(By.cssSelector("select[class='product_sort_container']"));
	Select select = new Select(sortOptions);
	select.selectByValue("lohi");
    
	//ADD ITEMS TO THE SHOPPING CART
	driver.findElement(By.cssSelector("button[class='btn_primary btn_inventory']")).click();
	driver.findElement(By.cssSelector("button[class='btn_primary btn_inventory']")).click();
	
	//VISIT SHOPPING CART
	driver.findElement(By.className("shopping_cart_container")).click();
	String item1=driver.findElement(By.xpath("//a[@id='item_2_title_link']")).getText();
	Assert.assertEquals("Sauce Labs Onesie",item1) ;
	System.out.println(driver.findElement(By.xpath("//a[@id='item_2_title_link']")).getText());	
	String item2=driver.findElement(By.xpath("//a[@id='item_0_title_link']")).getText();
	Assert.assertEquals("Sauce Labs Bike Light",item2) ;
	System.out.println(driver.findElement(By.xpath("//a[@id='item_0_title_link']")).getText());
	
	//REMOVE ITEM
    driver.findElement(By.xpath("//button[@class='btn_secondary cart_button']")).click();
	
    //CONTINUE SHOPPING AND ADD ANOTHER ITEM
	driver.findElement(By.xpath("//a[@class='btn_secondary']")).click();
	driver.findElement(By.cssSelector("button[class='btn_primary btn_inventory']")).click();
	
	//CHECKOUT
	driver.findElement(By.className("shopping_cart_container")).click();
	driver.findElement(By.linkText("CHECKOUT")).click();
	driver.findElement(By.id("first-name")).sendKeys("Mustafa");
	driver.findElement(By.id("last-name")).sendKeys("Ozturk");
	driver.findElement(By.id("postal-code")).sendKeys("21048");
	driver.findElement(By.cssSelector("input[value='CONTINUE']")).click();
	
	String revised2=driver.findElement(By.xpath("//a[@id='item_4_title_link']")).getText();
	Assert.assertEquals("Sauce Labs Backpack",revised2) ;
	
	
	
	driver.findElement(By.linkText("FINISH")).click();
	driver.close();
	
	
	
	}
	
	}



