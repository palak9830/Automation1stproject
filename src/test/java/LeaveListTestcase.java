import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.website.OrangeHRM.LeaveListFunctionality;
import com.website.orangeHRMBase.OrangeHRMBase;

public class LeaveListTestcase extends OrangeHRMBase {

	LeaveListFunctionality LL;
	
	@BeforeMethod
	public void Initialize() {
		LL=new LeaveListFunctionality();
		LL.Browse();
	}
	@Test
	public void LeaveList() {
		LL.LeaveListFunction();
	}
	@AfterMethod
	public void close() {
		LL.Teardown();
	}
	
}
