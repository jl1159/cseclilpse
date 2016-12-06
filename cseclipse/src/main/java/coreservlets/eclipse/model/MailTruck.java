package coreservlets.eclipse.model;

public class MailTruck extends AbstractVehicle {

	private String route;
	private int numberOfDeliveries;
	private Person mailCarrier;

	@Override
	public void go() {
		System.out.println("On to the next house!");
	}

	@Override
	public void stop() {
		System.out.println("Here's a mailbox. Time to stop.");
	}

	public String getRoute() {
		return route;
	}

	public void setRoute(String route) {
		this.route = route;
	}

	public int getNumberOfDeliveries() {
		return numberOfDeliveries;
	}

	public void setNumberOfDeliveries(int numberOfDeliveries) {
		this.numberOfDeliveries = numberOfDeliveries;
	}

	public Person getMailCarrier() {
		return mailCarrier;
	}

	public void setMailCarrier(Person mailCarrier) {
		this.mailCarrier = mailCarrier;
	}

	@Override
	public String toString() {
		return "MailTruck [route=" + route + ", numberOfDeliveries=" + numberOfDeliveries + ", mailCarrier=" + mailCarrier
		    + ", getFuelType()=" + getFuelType() + ", getCreatedDate()=" + getCreatedDate() + ", getMileage()="
		    + getMileage() + "]";
	}

}
