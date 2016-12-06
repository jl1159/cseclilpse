package coreservlets.eclipse.model;

import java.util.Date;

public abstract class AbstractVehicle {

	private String fuelType;
	private Date createdDate;
	private long mileage;

	// ================= ABSTRACT METHODS ====================

	public abstract void go();

	public abstract void stop();

	// ================ IMPLEMENTED METHODS =======================

	public String getFuelType() {
		return fuelType;
	}

	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public long getMileage() {
		return mileage;
	}

	public void setMileage(long mileage) {
		this.mileage = mileage;
	}

	@Override
	public String toString() {
		return "AbstractVehicle [fuelType=" + fuelType + ", createdDate=" + createdDate + ", mileage=" + mileage + "]";
	}

}
