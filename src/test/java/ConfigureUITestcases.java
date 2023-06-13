import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.website.OrangeHRM.ConfigureUI;
import com.website.orangeHRMBase.OrangeHRMBase;

public class ConfigureUITestcases extends OrangeHRMBase {

	ConfigureUI C;
	
	@BeforeMethod
	public void Initialize() {
		C =new ConfigureUI();
		C.Browse();
	}
	@Test
	public void Configure() {
	Assert.assertTrue(C.ConfigureUI());
	}
	@AfterMethod
	public void close() {
		C.Teardown();
	}
}
