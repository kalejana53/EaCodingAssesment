package config;

import java.io.FileInputStream;
import java.util.Properties;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import uikeywords.Keywords;

public class TestBase {
@Parameters("browserName")
		@BeforeMethod
		public void setUp(@Optional("Edge") String browserName) throws Exception {
			FileInputStream fis = null;
			Properties property = new Properties();
			fis = new FileInputStream(System.getProperty("user.dir")+ "/src/main/resources/Config.properties");
			property.load(fis);

			Keywords.openBrowser(browserName);
		}

		@AfterMethod
		public void close() throws Exception {
			Thread.sleep(3000);
		Keywords.tearDown();
			
		}
}
