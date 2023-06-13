import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.website.OrangeHRM.MyLeaveUI;
import com.website.orangeHRMBase.OrangeHRMBase;


public class MyLeaveUITestcase extends OrangeHRMBase {
	
	MyLeaveUI ML;

	@BeforeMethod
	public void Initialize() {
	ML= new MyLeaveUI();	
	ML.Browse();
	}
    @Test
	public void MyLeaveUITestCase() {
		Assert.assertTrue(ML.MyLeaveUI());
	} 
    @AfterMethod
	public void close() {
		ML.Teardown();
	}	
	
}
