import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.website.OrangeHRM.AddEntitlementFunctionality;
import com.website.orangeHRMBase.OrangeHRMBase;

public class AddEntitlementFunctionalityTestcases extends OrangeHRMBase{
	
	AddEntitlementFunctionality EF;
	
	@BeforeMethod
       public void Initialize() {
    	   EF= new AddEntitlementFunctionality();
    	   EF.Browse();
	}
	@Test
       public void AddEntitlementSectionOeTestecase() {
		EF.AddEntitlementSectionOne();
	}
	@AfterMethod
       public void close() {
		EF.Teardown();
	}
}
