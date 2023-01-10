package Utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropUtil {
	public static String getValue(String filepath, String key) {
		FileInputStream fis = null;
		Properties property = new Properties();
		
		try {
			fis = new FileInputStream(filepath);
			property.load(fis);
		} catch (FileNotFoundException e) {
			System.err.println("File not found" + filepath);
		} catch (IOException e) {
			System.err.println("Unable to load properties file" + filepath);
		}
		return property.getProperty(key);

	}
}
