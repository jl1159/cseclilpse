package coreservlets.eclipse.navresourceaccess;

import coreservlets.eclipse.logger.Logger;

public class NavigationHelper {

	private Logger logger;
	private static final String DEFAULT_HELP_TYPE = "NAVIGATION HELP";
	private String helpType;

	public NavigationHelper() {
		logger = new Logger();
	}

	public void help() {
		help(DEFAULT_HELP_TYPE);
	}

	public void help(String helpType) {
		this.helpType = helpType;
		logger.log(this.helpType);
	}
}
