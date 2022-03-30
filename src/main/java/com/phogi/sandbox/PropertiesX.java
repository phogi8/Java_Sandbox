package com.phogi.sandbox;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

public class PropertiesX {

	public static void main(String[] args) throws IOException {

		FileInputStream fis = new FileInputStream(new File("resources/test.properties"));

		Properties prop = new Properties();

		prop.load(fis);

		Set<Object> keys = prop.keySet();

		for (Object key : keys) {
			System.out.println(key.toString() + " : " + prop.getProperty(key.toString()));
		}

	}

}
