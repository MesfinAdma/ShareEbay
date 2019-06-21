

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;

public class NewTest_kaldisTest {
	
WebDriver driver;
	
  @Test(dataProvider = "dp")
  public void f(String n, String s, String x) throws Exception {
//	  	driver.findElement(By.xpath("//input[@id='u_0_e']")).clear();
//		driver.findElement(By.xpath("//input[@id='u_0_e']")).sendKeys(n);
//		driver.findElement(By.xpath("//input[@id='u_0_g']")).clear();
//		driver.findElement(By.xpath("//input[@id='u_0_g']")).sendKeys(s);
//		driver.findElement(By.xpath("//input[@id='u_0_j']")).clear();
//		driver.findElement(By.xpath("//input[@id='u_0_j']")).sendKeys(x);
//		
	  kaldis_HomePage run= PageFactory.initElements(driver,  kaldis_HomePage.class);
	  run.cred(n, s, x);
  
	  
		Thread.sleep(2000);  
	  
  }

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      
    	new Object[] {"Abebe", "Tesema", "piit@gmail.com"},
        new Object[] {"Mamush","Egla", "kassa@yahoo.com" },
        new Object[] {"Moham", "Brie","admas@gmail.com"},
    	new Object[] {"Tiru", "John", "peoplentech@gmail.com"},
        new Object[] {"Girma", "Tuu", "addis@yahoo.com"},
    	
    	};
  }
  @BeforeClass
  public void beforeClass() {
	  System.setProperty("webdriver.chrome.driver", 
			  "C:\\Users\\Mesfin Kassa A\\eclipse-workspace\\Selenium_Project\\ChromeDriver\\chromedriver.exe");
				driver=new ChromeDriver();
				String url="https://www.facebook.com";
				driver.get(url);  
	  
	  
	driver= browserFactory.openbrowser("chrome", "http://www.facebook.com/");
  }

  @AfterClass
  public void afterClass() {
	  driver.quit();
	  
  }

}
