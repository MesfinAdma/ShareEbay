

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class kaldis_HomePage {
  WebDriver driver;
  
	@FindBy(id="u_0_e") WebElement firstName;
	@FindBy(id="u_0_g") WebElement lastName;
	@FindBy(id="u_0_j") WebElement email;
	
	public kaldis_HomePage(WebDriver driver) {
		this.driver=driver;
		
	}
	
	public void cred(String fname, Strin1g lname, String mail) {
		
		firstName.clear();
		firstName.sendKeys(fname);
		lastName.clear();
		lastName.sendKeys(lname);
		email.clear();
		email.sendKeys(mail);
		
	}


  }
