import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.website.OrangeHRM.EntitlementUI;
import com.website.orangeHRMBase.OrangeHRMBase;

public class EntitlementUITestcases extends OrangeHRMBase  {
      EntitlementUI EU;
      
      @BeforeMethod
      public void Initialize() {
		EU= new EntitlementUI();
		EU.Browse();
	}
      @Test
      public void  EntitlementDropdownListTestcase() {
	Assert.assertTrue(EU.EntitlementUI());
	}
      @AfterMethod
      public void close() {
		EU.Teardown();
	}
}
