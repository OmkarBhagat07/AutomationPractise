package Selenium_Maven.M.Selenium_Maven.M;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class methods001 {

	private static boolean size;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        driver.get("https://www.amazon.in/");
        
        //locate link
       WebElement link = driver.findElement(By.xpath("//a[text()='Amazon miniTV']"));
       System.out.println("The link name :-"+link.getText());   
      // link.click();
       
       //Capture attribute name console
       System.out.println("Attrubute value is- "+link.getAttribute("class"));
       System.out.println("Attrubute value is- "+link.getAttribute("data-csa-c-content-id"));
       System.out.println("Attrubute value is- "+link.getAttribute("Sell"));
       
       //enter text in searchbox
        WebElement searchbox = driver.findElement(By.cssSelector("input[id='twotabsearchtextbox']"));
        searchbox.sendKeys("mobile");
       System.out.println("Searchbox is -"+searchbox.getAttribute("value"));
       
       // capture x-coordinate
       System.out.println("x-coordinate is - "+searchbox.getLocation().x);
       System.out.println("y-coordinate is - "+searchbox.getLocation().y);
       
       //capture size searchbox
       System.out.println("size of searchbox :- "+searchbox.getSize());
       
       //capture tag name
       System.out.println("tagname of web element :-"+searchbox.getTagName());
       
       // check the element is visible
       WebElement logo = driver.findElement(By.cssSelector("a#nav-logo-sprites"));
       System.out.println("check logo is:-"+logo.isDisplayed());
       
     //check the element is enabled
       System.out.println("check logo enabled:-"+ logo.isEnabled());
       
       
	}
       
	 
}
