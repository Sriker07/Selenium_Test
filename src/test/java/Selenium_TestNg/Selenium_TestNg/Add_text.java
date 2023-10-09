package Selenium_TestNg.Selenium_TestNg;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Wait;

public class Add_text {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.Chrome.driver","E:\\Sriker_Training\\ATE\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://practicetestautomation.com/practice-test-exceptions/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		String title= driver.getTitle();
		System.out.println(title);
//Test case 1: NoSuchElementException
		driver.findElement(By.id("add_btn")).click();
		driver.findElement(By.xpath("//div[@id='row2']/input"));
		driver.quit();
		
		
		
		

	}

}
