package com.phogi.sandbox;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LogX {

	private static final Logger log = LogManager.getLogger(LogX.class.getName());

	public static void main(String[] args) {

		log.debug("Debug Mesasge");
		log.error("Error Message");
		log.fatal("Fatal Message");

	}

}
