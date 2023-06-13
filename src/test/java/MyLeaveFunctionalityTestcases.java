import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.website.OrangeHRM.MyLeaveFunctionality;
import com.website.orangeHRMBase.OrangeHRMBase;

public class MyLeaveFunctionalityTestcases extends OrangeHRMBase{

	MyLeaveFunctionality ML;
	
	@BeforeMethod
	public void Initialize() {
		ML= new MyLeaveFunctionality();
		ML.Browse();
	}
	@Test
	public void MyLeaveTestcase() {
		ML.MyLeave();
	}
	@AfterMethod
	public void close() {
		ML.Teardown();
	}
}
