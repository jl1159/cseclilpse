package coreservlets.eclipse.logger;

import java.util.Date;

public class Logger {

	private static final String LOGGING_PREFIX = "[CSECLIPSE]: ";

	public void log(String label, String value) {
		String message = label + ": " + value;
		log(message);
	}

	public void log(String message) {
		System.out.println(new Date() + " " + LOGGING_PREFIX + message);
	}

}
