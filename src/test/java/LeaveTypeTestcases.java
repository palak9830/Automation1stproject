import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.website.OrangeHRM.LeaveTypeFunctionality;
import com.website.orangeHRMBase.OrangeHRMBase;

public class LeaveTypeTestcases extends OrangeHRMBase {

	LeaveTypeFunctionality LT;
	
	@BeforeMethod
	public void Initialize() {
		LT =new LeaveTypeFunctionality();
		LT.Browse();
	}
	@Test
	public void LeaveTypeTestcases() {
		LT.LeaveType();
	}
	public void close() {
		LT.Teardown();
	}
	
}
