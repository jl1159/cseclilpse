package coreservlets.eclipse.model;

import org.apache.commons.lang3.StringUtils;

import coreservlets.eclipse.string.util.CoreUtils;

public class Student extends Person {

	private String studentId;
	private double gpa;
	private boolean active;

	// =================== CONSTRUCTORS =====================

	public Student(String firstName, String lastName, String ssn) {
		super(firstName, lastName, ssn);
		this.studentId = generateStudentId(firstName, lastName, ssn);
		this.setActive(true);
		this.setGpa(0.0);
	}

	// =======================================================

	@Override
	public void doFavoriteThing() {
		System.out.println("Initiating hoola-hoop fun.");
	}

	private String generateStudentId(String... identifiers) {
		String studentId = null;
		if (CoreUtils.isNullOrEmpty(identifiers)) {
			studentId = String.valueOf(Math.random());
			return studentId;
		}
		int hash = StringUtils.join(identifiers, "").hashCode();
		studentId = String.valueOf(hash);
		return studentId;
	}

	public String getStudentId() {
		return studentId;
	}

	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}

	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", gpa=" + gpa + ", active=" + active + ", getFirstName()="
		    + getFirstName() + ", getLastName()=" + getLastName() + ", getSsn()=" + getSsn() + ", getFavoritePie()="
		    + getFavoritePie() + ", toString()=" + super.toString() + ", getFullName()=" + getFullName() + "]";
	}

}
