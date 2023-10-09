package Selenium_TestNg.Selenium_TestNg;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ebay_assessment{
	public static void main(String[] args) {
		System.setProperty("webdriver.Chrome.driver","E:\\Sriker_Training\\ATE\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.ebay.com/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		String title= driver.getTitle();
		System.out.println(title);
		driver.findElement(By.xpath("//input[@aria-label='Search for anything']")).sendKeys("Mac book");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@aria-label='Search for anything']")).sendKeys(Keys.ENTER);
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//button[@aria-label='Show more categories - All']/span")).click();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		List<WebElement> list =driver.findElements(By.xpath("//ul[@class='srp-refine__category__list']/li/a"));
		System.out.println("Menu Items are: ");
		 String select= "Computers/Tablets & Networking";
		 
	     
		for(int i=1;i<list.size();i++) {
			
			String statement = list.get(i).getText();
			System.out.println("Text is "+statement); 	 
			if (statement.contains(select)) {
				list.get(i).click();
				break;
			}
			
	      }
	      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	      String item=driver.findElement(By.xpath("//div[@class='s-item__title']/span/span[1]")).getText();
	      System.out.println(item);
		driver.close();
	}

		
	}
	
