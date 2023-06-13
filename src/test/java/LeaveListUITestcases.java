import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.website.OrangeHRM.LeaveListUI;
import com.website.orangeHRMBase.OrangeHRMBase;

public class LeaveListUITestcases extends OrangeHRMBase{
	
	LeaveListUI ll;
	
	@BeforeMethod
	public void initialize() {
		ll= new LeaveListUI();
		ll.Browse();
	}
	@Test
public void LeaveListUISection() {
	Assert.assertTrue(ll.LeaveListUI());
}
	@AfterMethod
public void close() {
	ll.Teardown();
}
}
