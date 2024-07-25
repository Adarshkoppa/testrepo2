package Login;

import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import Sign_up.Open_Close_appn;

public class Test_Log_in extends Open_Close_appn{
	@Test
	public void test() {
		driver.findElement(By.xpath("//input[@aria-label='Phone number, username, or email']")).sendKeys("adatest8042@gmail.com");
		driver.findElement(By.xpath("//input[@aria-label='Password']")).sendKeys("Im#adu@k08");
		WebElement log = driver.findElement(By.xpath("//div[text()='Log in']"));
		Actions act= new Actions(driver);
		act.click(log).perform();
		driver.findElement(By.xpath("//div[text()='Not now']")).click();
		//driver.findElement(By.xpath("//button[text()='Turn On']")).click();
		driver.findElement(By.xpath("(//*[local-name()='svg'])[1]")).click();
				}}
