import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.website.OrangeHRM.HolidaysFunctionality;
import com.website.orangeHRMBase.OrangeHRMBase;

public class HolidaysTestcases extends OrangeHRMBase {

	HolidaysFunctionality H;
	
	@BeforeMethod
	public void initialize() {
		H= new HolidaysFunctionality();
		H.Browse();
	}
	@Test
	public void HolidaysTestcases() {
		H.Holidays();
	}
	@AfterMethod
	public void close() {
		H.Teardown();
	}
}
