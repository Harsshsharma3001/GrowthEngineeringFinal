package utilities;

import java.io.File;
import java.io.FileReader;
import java.util.Properties;

public class ReadingProperties {
	public String profileurl;

	public void readingprop() throws Exception {
		File file = new File("src//test//resources//Growthengg.properties");
		FileReader filereader = new FileReader(file.getAbsolutePath());
		Properties properties = new Properties();
		properties.load(filereader);

		profileurl = properties.getProperty("url");

	}

}