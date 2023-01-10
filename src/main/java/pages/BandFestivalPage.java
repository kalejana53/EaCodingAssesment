package pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import uikeywords.Keywords;

public class BandFestivalPage {
	@FindBy(xpath = "/html/body/form/ol/li")
	private List<WebElement> WebBandNames;
	
	@FindBy(xpath="/html/body/form/ol/li/ul/li")
	private List<WebElement> WebFestivalNames;

	public BandFestivalPage() {
		PageFactory.initElements(Keywords.driver, this);
	}
	public String getPageTitle() {
		return Keywords.driver.getTitle();
	}
	public List<String> getBandNames() {
		List<String>BandNames=new ArrayList<String>();
		for(WebElement bn:WebBandNames) {
			
			String BandName=bn.getText();
			BandName=BandName.split("\n")[0];
			BandNames.add(BandName);
		}
		return BandNames;
	}

	public List<String> getFestivalNames() {
		List<String>FestivalNames=new ArrayList<String>();
		for(WebElement bn:WebFestivalNames) {
			
			String FestivalName=bn.getText();
			FestivalNames.add(FestivalName);
		}
		return FestivalNames;
	}
}
