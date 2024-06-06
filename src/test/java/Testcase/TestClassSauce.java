package Testcase;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class TestClassSauce {
	WebDriver driver = null ; 
  @Test
  public void a() {
	  DriverSetup obj = new DriverSetup();
	  driver = obj.chromesetup();
  }
  @Test
  public void b() {
	  driver.get("https://www.saucedemo.com/");
	  Assert.assertEquals(driver.getTitle(),"Swag Labs");
	  System.out.println("User is able to see the login page");
  }
  @Test
  public void c() {
	  driver.findElement(By.id("user-name")).sendKeys("standard_user");
	  driver.findElement(By.id("password")).sendKeys("secret_sauce");
	  driver.findElement(By.name("login-button")).click();
	  System.out.println("User is successfully able to login to Sauce Application");
  }
  @Test
  public void d() {
	  driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
	  driver.findElement(By.id("add-to-cart-sauce-labs-bolt-t-shirt")).click();
	  driver.findElement(By.id("add-to-cart-sauce-labs-onesie")).click();
	  System.out.println("User is able to add three products in the cart");
	  Assert.assertEquals("Remove", driver.findElement(By.id("remove-sauce-labs-backpack")).getText());
  } 
  @Test
  public void e() {
	  driver.findElement(By.xpath("//a[@class='shopping_cart_link']")).click();
	  driver.findElement(By.id("checkout")).click();
	  System.out.println("Click on Checkout");
  }
  @Test
  public void f() {
	  driver.findElement(By.id("first-name")).sendKeys("Demo");
	  driver.findElement(By.id("last-name")).sendKeys("Testing");
	  driver.findElement(By.id("postal-code")).sendKeys("123456");
	  driver.findElement(By.name("continue")).click();
	  Assert.assertEquals("Checkout: Overview", driver.findElement(By.xpath("//span[@class='title']")).getText());
	  
  }
  
  @Test
  public void g() {
	  driver.findElement(By.id("finish")).click();
	  String OrderMessage = driver.findElement(By.xpath("//h2[normalize-space()='Thank you for your order!']")).getText();
	  Assert.assertEquals(OrderMessage, "Thank you for your order!");
  }
  
}
