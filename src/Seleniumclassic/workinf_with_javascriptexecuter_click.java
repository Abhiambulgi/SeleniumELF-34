package Seleniumclassic;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class workinf_with_javascriptexecuter_click {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.oracle.com/java/technologies/downloads/");
	driver.findElement(By.xpath("//a[text()='jdk-8u333-linux-x64.tar.gz']")).click();
	Thread.sleep(2000);
	WebElement click=driver.findElement(By.xpath("//a[text()='Download jdk-8u333-linux-x64.tar.gz']"));
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("arguments[0].click();",click);
}
}
