package media;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NMobileMedia
{
@Test
	void run() throws InterruptedException
	{
		ChromeOptions option= new ChromeOptions();
		option.addArguments("start-maximized");
		option.setAcceptInsecureCerts(true);
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(option);
		driver.get("https://nmobile.media/pages/common/login");
		driver.findElement(By.xpath("//input[@type='number']")).sendKeys("9791314313");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("kiruba");
		WebDriverWait wait = new WebDriverWait(driver,50);
		WebElement sigin =driver.findElement(By.xpath("//uni-view[@class='login-btn']"));
		wait.until(ExpectedConditions.elementToBeClickable(sigin));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();",sigin);
		js.executeScript("arguments[0].click();",driver.findElement(By.xpath("//img[@src='/static/images/tabbar/task.png']")));
		Thread.sleep(5000);
		WebElement ele =driver.findElement(By.xpath("//img[@src='/static/images/tabbar/task.png']"));
		wait.until(ExpectedConditions.elementToBeClickable(ele));
		ele.click();
		Thread.sleep(15000);
		WebElement ele1=driver.findElement(By.xpath("//img[@src='/static/images/server/button_1.png']"));
		js.executeScript("arguments[0].click();",ele1);
		Thread.sleep(15000);
		js.executeScript("arguments[0].click();",ele1);
		Thread.sleep(5000);
		js.executeScript("arguments[0].click();",ele1);
		driver.quit();
	}

}
