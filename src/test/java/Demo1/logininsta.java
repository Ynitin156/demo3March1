package Demo1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class logininsta 
{

	public static void main(String[] args) throws InterruptedException 
	{
		   System.setProperty("webdriver.chrome.driver","D:\\softwares\\chromedriver.exe");
	       WebDriver driver = new ChromeDriver();
	       driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	       
	       String actualurl ="https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";
	       driver.manage().window().maximize();
	       
	       Thread.sleep(5000);
	       driver.findElement(By.name("username")).sendKeys("Admin");
	       driver.findElement(By.name("password")).sendKeys("admin123");
	       driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
	       
	       String Exceptedurl ="https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";
	       
	       if(actualurl==Exceptedurl)
	       {
	    	   System.out.println("url matched");
	       }
	       else
	       {
	    	   System.out.println("url not matched");
	       }

	}

}
