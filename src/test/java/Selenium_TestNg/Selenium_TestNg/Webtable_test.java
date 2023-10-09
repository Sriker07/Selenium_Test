package Selenium_TestNg.Selenium_TestNg;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtable_test {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.Chrome.driver","E:\\Sriker_Training\\ATE\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://fa-etfl-dev11-saasfaprod1.fa.ocs.oraclecloud.com/fscmUI/faces/AtkHomePageWelcome");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		
		//login
		driver.findElement(By.xpath("//input[@name='userid']")).sendKeys("skandala");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Welcome123");
		driver.findElement(By.xpath("//button[text()='Sign In ']")).click();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		String title= driver.getTitle();
		System.out.println(title);
		driver.findElement(By.xpath("//a[@title='Navigator']")).click();
		String Menuoption="Receivables";
		String path = "//div[@title='"+Menuoption+"']";
		System.out.println(path);
		driver.findElement(By.xpath(path)).click();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		String Submenuoption="Billing";
		String path2 = "//a[@title='"+Submenuoption+"']";
		System.out.println(path2);
		driver.findElement(By.xpath(path2)).click();
		Thread.sleep(15000);
		driver.findElement(By.xpath("//a[@aria-haspopup='true']")).click();
		Thread.sleep(5000);
		List<WebElement> List = driver.findElements(By.xpath("//ul[@aria-label='Billing']"));
		String select="00120-Equinix Japan K.K.";
		for(int i=0;i<List.size();i++) {
			String text=List.get(i).getText();
			if(text.contains(select)) {
				List.get(i).click();
				Thread.sleep(5000);
			}
		}
		int rows=driver.findElements(By.xpath("//table[@summary='Incomplete Transactions']/tbody/tr")).size();
		System.out.println("Table has "+rows+" rows");
		int col = driver.findElements(By.xpath("//span[@class='af_column_label-text']")).size();
		System.out.println("Table has "+col+" coloumns");
		
		String value="165,000";
		String tno="11001";
		for(int r=1;r<=rows;r++) {
			String textui= driver.findElement(By.xpath("//table[@summary='Incomplete Transactions']/tbody/tr["+r+"]/td//span[text()='"+value+"']")).getText();
			String trasno = driver.findElement(By.xpath("//table[@summary='Incomplete Transactions']/tbody/tr/td/div/table/tbody/tr/td/span//a[text()='"+tno+"']")).getText();
			if(textui.contains(value) && tno.contains(trasno)) {
				System.out.println(textui);
				System.out.println(trasno);
				break;
			}
		
		}
		driver.close();
		

	}

}
