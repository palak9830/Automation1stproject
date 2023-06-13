



import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.website.OrangeHRM.ApplyUI;
import com.website.orangeHRMBase.OrangeHRMBase;

public class ApplyUITestCases extends OrangeHRMBase {
	
	ApplyUI ap;
	
	@BeforeMethod
	public void initialization() {
		ap=new ApplyUI();
		ap.Browse();
		}

	
	@Test (priority=1)
   public void ApplyUIMessageTestCase() {
   Assert.assertTrue(ap.ApplyUIMessage());
   
	     }
	
	@AfterMethod
    public void close() {
	ap.Teardown();  
         }
    
}
