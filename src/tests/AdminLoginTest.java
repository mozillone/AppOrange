package tests;
 
import org.testng.annotations.Test;
import pages.AdminLoginPage;

 
public class AdminLoginTest extends BaseTest {
 
    // Extra information:
    // 1) @BeforeClass we declared driver and wait variables
    // 2) We send these driver and wait variables to the page class with below declaration
    //    AdminLoginPage homepage = new AdminLoginPage(driver,wait);
    // 3) super () method in page class transfer the driver and wait variables values to the BasePage class. 
 
    @Test (priority = 0)
    public void invalidLoginTest_InvalidUserNameInvalidPassword () throws InterruptedException {
    	
    	//*************PAGE INSTANTIATIONS*************
        AdminLoginPage adminLoginPage = new AdminLoginPage(driver,wait);
        
      //*************PAGE METHODS********************
        //Open N11 HomePage
        adminLoginPage.goToN11();
        
        //LogintoN11
        adminLoginPage.loginToN11("abdgdh", "123456");
        
        
      //*************ASSERTIONS***********************
       // Thread.sleep(500);
       // adminLoginPage.verifyLoginPassword((""));

    }
        @Test (priority = 1)
        public void invalidLoginTest_EmptyUserEmptyPassword () throws InterruptedException {
        	
        	//*************PAGE INSTANTIATIONS*************
        	AdminLoginPage adminLoginPage = new AdminLoginPage(driver,wait);
        	
        	//*************PAGE METHODS********************
            //Open N11 HomePage
            adminLoginPage.goToN11();
            
            //LogintoN11
            adminLoginPage.loginToN11("", "");
        }
            
        @Test (priority = 2)
        public void validLoginTest_EmptyUserEmptyPassword () throws InterruptedException {
            
        	//*************PAGE INSTANTIATIONS*************
        	AdminLoginPage adminLoginPage = new AdminLoginPage(driver,wait);
        	
        	//*************PAGE METHODS********************
            //Open N11 HomePage
            adminLoginPage.goToN11();
            
            //LogintoN11
            adminLoginPage.loginToN11("Admin", "admin");
    	
    }
    }