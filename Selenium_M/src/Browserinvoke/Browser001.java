package Browserinvoke;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browser001 {

	public static void main(String[] args) throws InterruptedException {
		//launch Browser
		
     // ChromeDriver driver=new ChromeDriver();
   //  FirefoxDriver fire =new FirefoxDriver();
		
		WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
      driver.get("https://www.flipkart.com/");
      driver.findElement(By.className("_30XB9F")).click();
      driver.findElement(By.className("Pke_EE")).sendKeys("iphone"+ Keys.ENTER);
     driver.findElement(By.className("_1_3w1N")).click();
      driver.close();
	}

}
