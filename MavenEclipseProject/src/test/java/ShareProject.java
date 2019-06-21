import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShareProject {
	
	private static final String String = null;

	WebDriver driver;
	
	@FindBy(id="userid") WebElement firstname;
	@FindBy(id="pass") WebElement password;
	@FindBy(xpath="//button[@id='sgnBt']") WebElement signin;
	
	public ShareProject(WebDriver driver) {
		this.driver=driver;
		
	
	}		
	}
	
		
