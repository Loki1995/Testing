package com.ram;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyFile {
	String file = "C:\\Users\\Admin\\eclipse-workspace\\Testing\\input\\file.properties";
	public void writeSomething() throws IOException {
		
		File f = new File("file");
		FileInputStream fi = new FileInputStream(f);
		Properties p = new Properties();
		
	}

	public static void main(String[] args) {
		

	}

}
