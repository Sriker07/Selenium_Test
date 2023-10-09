package Selenium_TestNg.Selenium_TestNg;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown_test {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.Chrome.driver","E:\\Sriker_Training\\ATE\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://fa-etfl-dev15-saasfaprod1.fa.ocs.oraclecloud.com/fscmUI/faces/AtkHomePageWelcome");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		
		//login
		driver.findElement(By.xpath("//input[@name='userid']")).sendKeys("rakumar");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Welcome123");
		driver.findElement(By.xpath("//button[text()='Sign In ']")).click();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		String title= driver.getTitle();
		System.out.println(title);
		driver.findElement(By.xpath("//a[@title='Navigator']")).click();
		String Menuoption="My Enterprise";
		String path = "//div[@title='"+Menuoption+"']";
		System.out.println(path);
		driver.findElement(By.xpath(path)).click();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		String Submenuoption="Setup and Maintenance";
		String path2 = "//a[@title='"+Submenuoption+"']";
		System.out.println(path2);
		driver.findElement(By.xpath(path2)).click();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		Select option=  new Select(driver.findElement(By.xpath("//select[@class='x2h']")));
		option.selectByVisibleText("Required Tasks");
		Thread.sleep(8000);
		driver.close();

	}

}
