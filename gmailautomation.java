package seleniumproject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class gmailautomation {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver",
	 "C:\\Users\\K A V I N\\eclipse-workspace\\seleniumproject\\driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://accounts.google.com/v3/signin/identifier?authuser=0&continue=https%3A%2F%2Fmail.google.com%2Fmail&ec=GAlAFw&hl=en-GB&service=mail&flowName=GlifWebSignIn&flowEntry=AddSession&dsh=S470479078%3A1719664577188050&ddm=0");
		
		WebElement username=driver.findElement(By.xpath("//input[@type=\"email\"]"));
		username.sendKeys("kavinraj760188");
		username.sendKeys(Keys.ENTER);
		Thread.sleep(5000);
		WebElement password=driver.findElement(By.xpath("//input[@type=\"password\"]"));
		password.sendKeys("Kavin@2244");
		password.sendKeys(Keys.ENTER);
		Thread.sleep(5000);
		
		WebElement compose=driver.findElement(By.xpath("//div[@class=\"T-I T-I-KE L3\"]"));
		compose.click();
		Thread.sleep(5000);
		WebElement tofield=driver.findElement(By.xpath("//input[@class=\"agP aFw\"]"));
		tofield.sendKeys("kavinraj760188@gmail.com");
		
		WebElement subject=driver.findElement(By.xpath("//input[@name=\"subjectbox\"]"));
		subject.sendKeys("TEST MAIL");
		Thread.sleep(5000);
		WebElement textfield=driver.findElement(By.xpath("//div[@role=\"textbox\"]"));
		textfield.sendKeys("Test Email Body");
		Thread.sleep(5000);
		WebElement labelselection=driver.findElement(By.xpath("//div[@aria-label=\"More options\"]"));
		labelselection.click();
		Thread.sleep(5000);
	WebElement label=driver.findElement(By.xpath("//span[@class=\"J-Ph-hFsbo\"]"));
	label.click();
	Thread.sleep(1000);
	label=driver.findElement(By.xpath("//div[@title=\"Social\"]"));
	label.click();
	
	Thread.sleep(3000);
	WebElement sendemail=driver.findElement(By.xpath("//div[contains(@class, 'T-I J-J5-Ji aoO v7 T-I-atl L3')]"));
	sendemail.click();
	Thread.sleep(5000);
	driver.navigate().refresh();
	
	WebElement social=driver.findElement(By.xpath("//div[@id=\":1u\"]"));
	social.click();
	WebElement receivedemail=driver.findElement(By.xpath("//tr[@class=\"zA zE\"and@id=\":6x\"]"));
	receivedemail.click();
	
	}

}
