import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.website.OrangeHRM.AddEntitlementFunctionality;
import com.website.OrangeHRM.MyEntitlementFunctionality;
import com.website.orangeHRMBase.OrangeHRMBase;

public class MyEntitlementTestcases extends OrangeHRMBase{

MyEntitlementFunctionality ME;
	
	@BeforeMethod
       public void Initialize() {
    	   ME= new MyEntitlementFunctionality();
    	   ME.Browse();
	}
	@Test
       public void AddEntitlementSectionOeTestecase() {
		ME.MyLeaveEntitlement();
	}
	@AfterMethod
       public void close() {
		ME.Teardown();
	}
}
