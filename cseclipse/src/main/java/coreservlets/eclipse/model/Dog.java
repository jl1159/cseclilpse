package coreservlets.eclipse.model;

public class Dog extends AbstractOrganism {

	private String breed;
	private long weightInPounds;
	private String color;
	private int age;

	// =======================================================

	@Override
	public void doFavoriteThing() {
		MailTruck mailTruck = new MailTruck();
		Person mailman = new Person();
		mailTruck.setMailCarrier(mailman);
		for (int i = 0; i < 1000000; i++) {
			mailTruck.go();
			chase(mailTruck);
			mailTruck.stop();
			bite(mailman);
		}
	}

	private void chase(AbstractVehicle vehicle) {
		System.out.println("Woof woof wooooof"); // Excuse me, please stop.
	}

	private void bite(AbstractOrganism organism) {
		System.out.println("Bark bark baaaark!"); // Need a hug?
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public long getWeightInPounds() {
		return weightInPounds;
	}

	public void setWeightInPounds(long weightInPounds) {
		this.weightInPounds = weightInPounds;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Dog [breed=" + breed + ", weightInPounds=" + weightInPounds + ", color=" + color + ", age=" + age
		    + ", getFullName()=" + getFullName() + "]";
	}

}
