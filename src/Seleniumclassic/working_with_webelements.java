package Seleniumclassic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class working_with_webelements {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in/");
	List<WebElement> l=driver.findElements(By.tagName("a"));
	for(WebElement b:l){
		System.out.println(b.getText());
	}
	/*for(int i=0; i<l.size()-1; i++){
		System.out.println(l.get(i).getText());
	}
	driver.quit()*/;
}
}

