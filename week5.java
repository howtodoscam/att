package bhanu;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class week5 {
	public static void main(String[] args) throws InterruptedException
	{
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\student\\Downloads\\chromedriver_win32 (7)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://cmritautonomous.org/BeeSERP/Login.aspx");
		Thread.sleep(2000);
		Actions builder=new Actions(driver);
		WebElement uid=driver.findElement(By.name("txtUserName"));
		uid.sendKeys("20R01A6638P");
		WebElement nbtn=driver.findElement(By.name("btnNext"));
		nbtn.click();
		WebElement pid=driver.findElement(By.name("txtPassword"));
		pid.sendKeys("20R01A6638P");
		WebElement submit=driver.findElement(By.name("btnSubmit"));
	    submit.click();
		
		
	}
}

