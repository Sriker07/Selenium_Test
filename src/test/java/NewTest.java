import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class NewTest {
	
	WebDriver driver;
  @Test
  public void invoke() {
	  
			System.setProperty("webdriver.Chrome.driver","E:\\Sriker_Training\\ATE\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("https://www.ebay.com/");
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.manage().window().maximize();
	  
	  	  
  }
  @Test
  public void tilte() {
	  driver = new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		String title= driver.getTitle();
		System.out.println(title);
		
	  
  }
  @Test
  public void tc1() {
	  driver = new ChromeDriver();
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
  }

  @Test
  public void item() {
	  driver = new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
      String item=driver.findElement(By.xpath("//div[@class='s-item__title']/span/span[1]")).getText();
      System.out.println(item);  
  }


  @Test
  public void close() {
	  driver = new ChromeDriver();
	  driver.close();
  }

}
