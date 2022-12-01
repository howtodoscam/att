package bhanu;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class week10{

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		  System.setProperty("webdriver.chrome.driver","C:\\Users\\student\\Downloads\\chromedriver_win32 (7)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://gmail.com");
		Thread.sleep(2000);
		WebElement cn=driver.findElement(By.xpath("//span[normalize-space()='Create account']"));
		cn.click();
		Thread.sleep(2000);
		WebElement personal=driver.findElement(By.xpath("//span[normalize-space()='For my personal use']"));
		personal.click();
		Thread.sleep(2000);
		WebElement fname = driver.findElement(By.name("firstName"));
		fname.sendKeys("Bhanu");
		WebElement lname = driver.findElement(By.name("lastName"));
		lname.sendKeys("Prasad");
		WebElement uname = driver.findElement(By.name("Username"));
		uname.sendKeys("bhanu@13123123124");
		WebElement pass = driver.findElement(By.name("Passwd"));
		pass.sendKeys("bhanu@123P");
		WebElement cpass = driver.findElement(By.name("ConfirmPasswd"));
		cpass.sendKeys("bhanu@123P");
		Thread.sleep(2000);
		WebElement submit=driver.findElement(By.xpath("//button[normalize-space()='Next']"));
        submit.click();
        Thread.sleep(2000);
        WebElement mobile=driver.findElement(By.id("phoneNumberId"));
        mobile.sendKeys("846874677");
        WebElement submit1=driver.findElement(By.xpath("//span[normalize-space()='Next']"));
        submit1.click();
	}

}
