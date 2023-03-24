package teslatestpage;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class testlamain {
	
	WebDriver driver;
	@BeforeMethod
	public void Setup() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions co=new ChromeOptions();
        co.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(co);
        driver.get("https://www.tesla.com/");
        driver.manage().window().maximize();
        
        
    }
	
	@Test(priority=1)
	public void clickshop_naseela60() throws InterruptedException {
		driver.findElement(By.xpath("//span[text()='Shop']")).click();
		driver.findElement(By.xpath("//a[text()='Charging']")).click();
		
        WebElement element = driver.findElement(By.xpath("//a[@title='Corded Mobile Connector']"));
        
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click();",element);
		
	}

	@Test(priority=2)
	public void clickshoptwo_naseela67() throws InterruptedException {
		driver.findElement(By.xpath("//span[text()='Shop']")).click();
		driver.findElement(By.xpath("//a[text()='Charging']")).click();
		
        WebElement element = driver.findElement(By.xpath("//a[@title='Corded Mobile Connector']"));
        
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click();",element);
		
	}

}
