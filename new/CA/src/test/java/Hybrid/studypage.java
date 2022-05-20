package Hybrid;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class studypage {

	WebDriver driver;

	public studypage(WebDriver driver )
	{
		this.driver =driver;
	}
	@FindBy(xpath="//li[@class='topnav_item studyunit']") WebElement findtext;
	@FindBy(xpath="//li[@class='subnav_item 1600']") WebElement findstu;
	public void studypageo() throws InterruptedException
	 {
		findtext.click();
		Thread.sleep(3000);
		System.out.println("this is text from study");
		 String str2=findtext.getText();
		 Thread.sleep(2000);
		 System.out.println(str2);
		 
		 Helperclass.captureScreenshots(driver);
		 findstu.click();
		 

			 
		 


	 }
}
