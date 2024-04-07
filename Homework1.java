package variousConcepts;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Homework1 {
	WebDriver driver;

	@Before
	public void init() {
		//CHROME SETUP
		System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.get("https://codefios.com/ebilling/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}
	@Test
	public void testLogin() {
		//ELEMENT LIST
		//WebElement USER_NAME = driver.findElement(By.xpath("//input[@id='user-name']"));
	//	WebElement PASSWORD = driver.findElement(By.xpath("//*[@id=\"password\"]"));
	//	WebElement SIGNIN_BUTTON = driver.findElement(By.xpath("//*[@id=\"login_submit\"]"));
         
		driver.findElement(By.id("user_name")).sendKeys("demo@codefios.com");
		driver.findElement(By.id("password")).sendKeys("abc123");
		driver.findElement(By.id("login_submit")).click();
		
			}
	public void Transactions() {
		driver.findElement(By.xpath("//span[contains(text(),'Transactions')]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Deposit')]")).click();
		driver.findElement(By.xpath("//input[@name = 'name']")).sendKeys("Alicy Kay");
		Select accountsDrp = new Select(driver.findElement(By.xpath("//li[@id = 'select2-account_id-lb-result-9kw7-39']")));
		accountsDrp.selectByVisibleText("account3");
		driver.findElement(By.xpath("//input[@class = 'select2-search__field']")).sendKeys("01-07-2024");
		driver.findElement(By.xpath("//input[@class = 'form-control ']")).sendKeys("10000");
		driver.findElement(By.xpath("//button[@class = 'btn btn-sm btn-primary']")).click();
		
		
	}

}
