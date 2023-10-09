package Selenium_TestNg.Selenium_TestNg;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaSp {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.Chrome.driver","E:\\Sriker_Training\\ATE\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://fa-etfl-dev15-saasfaprod1.fa.ocs.oraclecloud.com/fscmUI/faces/AtkHomePageWelcome");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		WebElement hlt= (WebElement)js.executeScript("document.getElementsByName('userid')[0].style.border='10px blue solid';");
		Thread.sleep(3000);
		WebElement bgc= (WebElement)js.executeScript("document.getElementsByName('userid')[0].style.background='yellow';");
		Thread.sleep(3000);
	    js.executeScript("document.getElementsByName('userid')[0].value='rakumar';");
		//UserID.sendKeys("rakumar");
		WebElement pwd= (WebElement)js.executeScript("return document.getElementsByName('password')[0];");
		pwd.sendKeys("Welcome123");
		
		WebElement signin= (WebElement)js.executeScript("return document.getElementsByClassName('btnActiveChooser unemphasized signinWidth')[0];");
		signin.click();
		Thread.sleep(10000);
		WebElement un= (WebElement)js.executeScript("document.getElementById('pt1:atkph1::_afrTtxt').style.background='yellow';");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@title='Navigator']")).click();
		Thread.sleep(3000);
		String Menuoption="Others";
		String path = "//div[@title='"+Menuoption+"']";
		System.out.println(path);
		driver.findElement(By.xpath(path)).click();
		Thread.sleep(3000);
		
		String Submenuoption="Marketplace";
		String path2 = "//a[@title='"+Submenuoption+"']";
		System.out.println(path2);
		driver.findElement(By.xpath(path2)).click();
		Thread.sleep(3000);
		
		Set<String> tab=driver.getWindowHandles();
		Iterator index = tab.iterator();
		String ptab=(String)index.next();
		String chtab = (String)index.next();
		driver.switchTo().window(chtab);
		
		String chtit=driver.getTitle();
		System.out.println(chtit);
		Thread.sleep(8000);
		js.executeScript("document.getElementById('pt1:listResults:partnerHomePageLink:cml1').scrollIntoView();");
		Thread.sleep(5000);
		driver.close();
		Thread.sleep(3000);
		driver.close();
	}
}
