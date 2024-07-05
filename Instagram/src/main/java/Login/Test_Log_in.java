package Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import Sign_up.Open_Close_appn;

public class Test_Log_in extends Open_Close_appn{
	@Test
	public void test() {
		driver.findElement(By.xpath("//input[@aria-label='Phone number, username, or email']")).sendKeys("Abc123");
		driver.findElement(By.xpath("//input[@aria-label='Password']")).sendKeys("123456");
		WebElement log = driver.findElement(By.xpath("//div[text()='Log in']"));
		Actions act= new Actions(driver);
		act.click(log).perform();
		}}
