package library org.testng.annotations.AfterTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class AdminUtils extends library.Utils.AppUtils

{
	
	Loginpage lp;
	
    @BeforeTest
	public void AdminLogin(String adminuid, String adminpwd)
	
	{
    	lp = new Loginpage();
		lp.login(adminuid, adminpwd);
		
	}
    
    @AfterTest
    public void AdminLogout()
    {
    	lp.Logout();
    }
	
	
}
