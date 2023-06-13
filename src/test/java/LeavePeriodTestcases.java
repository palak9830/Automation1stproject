import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.website.OrangeHRM.LeavePeriodFunctionality;
import com.website.orangeHRMBase.OrangeHRMBase;

public class LeavePeriodTestcases extends OrangeHRMBase {

	LeavePeriodFunctionality LP;
	
	@BeforeMethod
	public void initialize() {
		LP =new LeavePeriodFunctionality();
		LP.Browse();
	}
	@Test
	public void LeavePeriod() {
		LP.LeavePeriod();
	}
	@AfterMethod
	public void close() {
		LP.Teardown();
	}
}
