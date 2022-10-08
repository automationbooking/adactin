package com.automation.org;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Adactin {
		public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Lap-319\\eclipse-workspace\\selenium\\driver2\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.get("https://adactinhotelapp.com/");
	
	driver.findElement(By.id("username")).sendKeys("balubala");
	
	driver.findElement(By.id("password")).sendKeys("balubala");
	
	driver.findElement(By.id("login")).click();
	
	driver.findElement(By.id("location")).sendKeys("Brisbane");
	
	driver.findElement(By.name("Submit")).click();
	
	driver.findElement(By.id("radiobutton_1")).click();
	
	driver.findElement(By.id("continue")).click();
	
	driver.findElement(By.name("first_name")).sendKeys("balaji");
	
	driver.findElement(By.name("last_name")).sendKeys("ji");
	
	driver.findElement(By.name("address")).sendKeys("dubaikurukusanthu");
	
	driver.findElement(By.id("cc_num")).sendKeys("1234567892045745");
	
	driver.findElement(By.id("cc_type")).sendKeys("VISA");
	
	driver.findElement(By.name("cc_exp_month")).sendKeys("JUNE");
	
	driver.findElement(By.name("cc_exp_year")).sendKeys("2024");
	
	driver.findElement(By.name("cc_cvv")).sendKeys("963");
	
	driver.findElement(By.name("book_now")).click();	

		
		}
}
	

