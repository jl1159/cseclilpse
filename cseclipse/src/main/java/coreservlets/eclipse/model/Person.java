package coreservlets.eclipse.model;

public class Person extends AbstractOrganism {

	private String firstName;
	private String lastName;
	private String ssn;
	private String favoritePie;
	
	// =================== CONSTRUCTORS =====================

	public Person() {

	}

	public Person(String firstName, String lastName, String ssn) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.ssn = ssn;
		this.setFullName(firstName + " " + lastName);
	}
	
	// =======================================================

	@Override
	public void doFavoriteThing() {
		System.out.println("Initiating hoola-hoop fun.");
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	public String getFavoritePie() {
		return favoritePie;
	}

	public void setFavoritePie(String favoritePie) {
		this.favoritePie = favoritePie;
	}

	@Override
	public String toString() {
		return "Person [firstName=" + firstName + ", lastName=" + lastName + ", ssn=" + ssn + ", favoritePie=" + favoritePie
		    + "]";
	}


}
