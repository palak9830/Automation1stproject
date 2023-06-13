import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.website.OrangeHRM.AssignLeaveUI;
import com.website.orangeHRMBase.OrangeHRMBase;

public class AssignLeaveUITestcases extends OrangeHRMBase {
	
	AssignLeaveUI AL;
	
	@BeforeMethod
	public void initialize() {
		AL = new AssignLeaveUI();
		AL.Browse();
	}
	@Test
	public void AssignLeaveUI() {
		Assert.assertTrue(AL.AssignLeave());
	}
	@AfterMethod
    public void close() {
		AL.Teardown();
	}
}
