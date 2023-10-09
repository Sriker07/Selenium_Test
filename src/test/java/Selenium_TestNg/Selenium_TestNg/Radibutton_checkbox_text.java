package Selenium_TestNg.Selenium_TestNg;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Radibutton_checkbox_text {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.Chrome.driver","E:\\Sriker_Training\\ATE\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://artoftesting.com/samplesiteforselenium");
		driver.manage().window().maximize();
		Thread.sleep(10000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scroll(700,700);");
		Thread.sleep(5000);
		String gdr = "male";
		String type= "Automation";
		driver.findElement(By.xpath("//input[@id='"+gdr+"']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@type='checkbox' and @value='"+type+"']")).click();
		driver.close();

	}

}
