package qsp;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.reflect.FieldUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShot 
{
   private static final String Outputtype = null;

static
   {
     System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe");
     System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
   }
    public static void main(String[] args) throws InterruptedException, IOException
    {
     WebDriver driver=new ChromeDriver();
     driver.manage().window().maximize();
     Thread.sleep(2000);
     driver.get("https://www.actitime.com/");
     //create refrence of takesscreenshot
     TakesScreenshot t=(TakesScreenshot)driver;
  
  //to get screenshot
    File src =t.getScreenshotAs(OutputType.FILE);
    
    
    
    File des =new File("‪‪D:\\screenshot/link.png");
	     
    FileUtils.copyFile(src, des);
    
   
	     
	     
	
	     
	     
	    
     

    }

}
