import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.website.OrangeHRM.AssignLeaveFunctionality;
import com.website.orangeHRMBase.OrangeHRMBase;

public class AssignLeaveFunctionalityTestcases extends OrangeHRMBase {

	AssignLeaveFunctionality AL;
	
	@BeforeMethod
	public void Initialize() {
		AL= new AssignLeaveFunctionality ();
		AL.Browse();
	}
	@Test
	public void AssignLeaveSection() {
		AL.AssignLeave();
	}
	@AfterMethod
	public void close() {
		AL.Teardown();
	}
}
