package TestCases;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import config.TestBase;
import junit.framework.Assert;
import pages.BandFestivalPage;
import util.ExcelSupplier;

public class BandFestivalPageTest extends TestBase {
	@Test(priority=1)
	public void VerifyWebPageTitle(){
		String ExpTitle="Festival";
		BandFestivalPage bf = new BandFestivalPage();
		String ActualTitle=bf.getPageTitle();
		Assert.assertTrue(ExpTitle.equalsIgnoreCase(ActualTitle));
	}

	@Test(priority=2)
	public void VerifyBandNames() throws IOException {
		ExcelSupplier obj = new ExcelSupplier();
		List<String> ActualBandNames = obj.readBandNames();
		BandFestivalPage bf = new BandFestivalPage();
		List<String> ExpectedBandNames = bf.getBandNames();
		Assert.assertEquals(ActualBandNames, ExpectedBandNames);
	}

	@Test(priority=3)
	public void VerifyFestivalNames() throws IOException {
		ExcelSupplier obj = new ExcelSupplier();
		List<String> ActualFestivalNames = obj.readFestivalNames();
		BandFestivalPage bf = new BandFestivalPage();
		List<String> ExpectedFestivalNames = bf.getFestivalNames();
		Assert.assertEquals(ActualFestivalNames, ExpectedFestivalNames);
	}
}
