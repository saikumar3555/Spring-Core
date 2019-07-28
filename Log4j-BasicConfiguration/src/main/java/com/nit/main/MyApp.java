package com.nit.main;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class MyApp {

	public static void main(String[] args) {
		//initialization logger
	Logger logger=Logger.getLogger(MyApp.class);
	BasicConfigurator.configure();
	
	logger.trace("this is trace message");
	logger.debug("this is debug message");
	logger.info("this is info message");
	logger.warn("this is warn message");
	logger.error("this is error message");
	logger.fatal("This is fatal message");

	}

}
