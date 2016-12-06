package coreservlets.eclipse.navresourceaccess;

import java.util.Date;

import coreservlets.eclipse.logger.Logger;
import coreservlets.eclipse.string.util.CoreUtils;

public class NavigationPractice {

	private Logger logger;
	private NavigationHelper navigationHelper;
	private Date navigateStartDate;
	private Date navigateEndDate;

	public void init() {
		logger = new Logger();
		navigationHelper = new NavigationHelper();
	}

	public void navigate() {
		init();
		preNavigate();
		navigationHelper.help();
		alert();
		postNavigate();
	}

	// =================== HELPER METHODS ========================

	private void preNavigate() {
		this.navigateStartDate = new Date();
	}

	private void alert() {
		logger.log("Time to navigate!");
	}

	private void postNavigate() {
		System.out.println("In " + CoreUtils.getMethodName());
		this.navigateEndDate = new Date();
		logger.log("Start: " + navigateStartDate + ", End: " + navigateEndDate);
	}
}
