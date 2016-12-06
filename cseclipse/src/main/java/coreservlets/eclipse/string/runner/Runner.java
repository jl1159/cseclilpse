package coreservlets.eclipse.string.runner;

import coreservlets.eclipse.logger.Logger;
import coreservlets.eclipse.string.util.SillyStringUtils;

public class Runner {

	private static Logger logger;

	public static void init() {
		logger = new Logger();
	}

	public static void main(String[] args) {
		init();
		String input = "elephants are big and gray";

		String pigLatin = SillyStringUtils.toPigLatin(input);
		String erkelizedInput = SillyStringUtils.steveErkelize(input);
		String encodlerized = SillyStringUtils.encodlerize(input);
		String reversed = SillyStringUtils.reverse(input);
		String extremeCamelCase = SillyStringUtils.extremeCamelCase(input);

		logger.log("INPUT", input);
		logger.log("Pig Latin", pigLatin);
		logger.log("As Steve Erkel would say", erkelizedInput);
		logger.log("Encodlerized", encodlerized);
		logger.log("Reversed", reversed);
		logger.log("Extreme Camel Case", extremeCamelCase);
	}

}
