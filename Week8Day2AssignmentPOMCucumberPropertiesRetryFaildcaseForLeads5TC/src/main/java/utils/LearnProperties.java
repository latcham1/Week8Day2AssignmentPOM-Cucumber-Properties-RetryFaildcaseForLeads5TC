package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class LearnProperties {
public static void main(String[] args) throws IOException {
	FileInputStream fis = new FileInputStream("src/main/resources/config.properties");
	Properties prop= new Properties();
	prop.load(fis);
	prop.getProperty("username");
	prop.getProperty("password");
}
}
