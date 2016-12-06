package coreservlets.eclipse.model;

public abstract class AbstractOrganism {

	private String fullName;

	// =================== ABSTRACT METHODS =====================

	public abstract void doFavoriteThing();

	// =================== IMPLEMENTED METHODS ========================

	public void sayName() {
		System.out.println("My name is " + fullName);
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

}
