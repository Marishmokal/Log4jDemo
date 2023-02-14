package com.prowings.logdemo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.ThreadContext;

public class Helloworld {

	private static final Logger logger=LogManager.getLogger(Helloworld.class);
	
	public static void main(String[] args) throws InterruptedException {
		ThreadContext.put("Transaction id","12345");
		
		logger.fatal("Fatal level event");
		logger.error("Error level event ");
		logger.warn("Warn level event");
		logger.info("Info level event ");
		logger.debug("Debug level event");
		logger.trace("Trace level event ");
		addition(10,20);
	}

	private static void addition(int i, int j) throws InterruptedException {
		logger.info("addition method started");
		
		int result=i+j;
		logger.info("result is{}",result);
		Thread.sleep(50000);
		logger.info("addition method ended");
		
	}
	
}
