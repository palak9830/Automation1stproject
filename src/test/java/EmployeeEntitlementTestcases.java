import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.website.OrangeHRM.AddEntitlementFunctionality;
import com.website.OrangeHRM.EmployeeEntitlementFunctionality;
import com.website.orangeHRMBase.OrangeHRMBase;

public class EmployeeEntitlementTestcases extends OrangeHRMBase{
 EmployeeEntitlementFunctionality EE;
	
	@BeforeMethod
       public void Initialize() {
    	   EE= new EmployeeEntitlementFunctionality();
    	   EE.Browse();
	}
	@Test
       public void EmployeeEntitlementSectionOeTestecase() {
		EE.LeaveEntitlement();
	}
	@AfterMethod
       public void close() {
		EE.Teardown();
}
}