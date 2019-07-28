package com.nit.main;

import java.io.File;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class MyApp {

	private static Logger logger = Logger.getLogger(MyApp.class);

	public static void main(String[] args) {

		// BasicConfigurator.configure();
		PropertyConfigurator.configure(System.getProperty("user.dir") + File.separator + "log4j.properties");

		logger.trace("This is trace message");
		logger.debug("This is debug message");
		logger.info("This is info message");
		logger.warn("This is warn message");
		logger.error("This is error messagae");
		logger.fatal("This is fatal message");

	}

}
