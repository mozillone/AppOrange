package pages;
 
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
 
public class AdminLoginPage extends BasePage {
 
    //*********Constructor*********
    public AdminLoginPage (WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }
 
    //*********Page Variables*********
    String baseURL = "http://opensource.demo.orangehrmlive.com/";
    
  //*********Web Elements*********
    String usenameId = "txtUsername";
    String passwordId = "txtPassword";
    String loginButtonId = "btnLogin";
    String errorMessageUsernameXpath = "//*[@id=\"loginForm\"]/div[1]/div/div";
    String errorMessagePasswordXpath = "//*[@id=\"loginForm\"]/div[2]/div/div ";
 
 
    
 
    //*********Page Methods*********  
    
   //Go to AdminLoginPage
       public void goToN11 (){
           driver.get(baseURL);
        //driver.navigate().to(baseURL)
        
       }    
        public void loginToN11 (String username, String password){
            //Enter Username(Email)
            writeText(By.id(usenameId),username);
            //Enter Password
            writeText(By.id(passwordId), password);
            //Click Login Button
            click(By.id(loginButtonId));
        }
     
        //Verify Username Condition
        public void verifyLoginUserName (String expectedText) {
            Assert.assertEquals(readText(By.xpath(errorMessageUsernameXpath)), expectedText);
        }
     
        //Verify Password Condition
        public void verifyLoginPassword (String expectedText) {
            Assert.assertEquals(readText(By.xpath(errorMessagePasswordXpath)), expectedText);
        }
     
    }

 
    
 
    
    

