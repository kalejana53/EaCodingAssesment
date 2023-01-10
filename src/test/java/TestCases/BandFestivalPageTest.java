package TestCases;

import java.io.IOException;
import java.util.List;

import org.testng.annotations.Test;

import config.TestBase;
import pages.BandFestivalPage;
import util.ExcelSupplier;

public class BandFestivalPageTest extends TestBase {
	@Test(priority=1)
	public void VerifyWebPageTitle(){
		String ExpTitle="Festival";
		BandFestivalPage bf = new BandFestivalPage();
		String ActualTitle=bf.getPageTitle();
		System.out.println(ActualTitle);
		//Assert.assertTrue(ExpTitle.equalsIgnoreCase(ActualTitle));
	}
	@Test(priority=2)
	public void VerifyNoOfBands(){
		BandFestivalPage bf = new BandFestivalPage();
		List<String> ExpectedBandNames = bf.getBandNames();
		int BandCount=ExpectedBandNames.size();
		System.out.println(BandCount);
	}
	@Test(priority=3)
	public void VerifyNoOfFestivals(){
		BandFestivalPage bf = new BandFestivalPage();
		List<String> ActualFestivalNames = bf.getFestivalNames();
		int FestivalCount=ActualFestivalNames.size();
		System.out.println(FestivalCount);
	}

	@Test(priority=4)
	public void VerifyBandNames() throws IOException {
		ExcelSupplier obj = new ExcelSupplier();
		List<String> ExpectedBandNames = obj.readBandNames();
		BandFestivalPage bf = new BandFestivalPage();
		List<String> ActualBandNames = bf.getBandNames();
		//Assert.assertEquals(ActualBandNames, ExpectedBandNames);
	}

	@Test(priority=5)
	public void VerifyFestivalNames() throws IOException {
		ExcelSupplier obj = new ExcelSupplier();
		List<String> ExpectedFestivalNames = obj.readFestivalNames();
		BandFestivalPage bf = new BandFestivalPage();
		List<String> ActualFestivalNames = bf.getFestivalNames();
		//Assert.assertEquals(ActualFestivalNames, ExpectedFestivalNames);
	}
	
	public void VerifyBandNameAgainstFestivalName() {
		
	}
}
