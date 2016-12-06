package coreservlets.eclipse.model;

public class Dinosaur extends AbstractOrganism {

	private String type;
	private boolean extinct;
	private long weight;

	// =======================================================

	@Override
	public void doFavoriteThing() {
		Person person = new Person();
		eat(person);
	}

	private void eat(AbstractOrganism organism) {
		organism = null; // Yum!
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public boolean isExtinct() {
		return extinct;
	}

	public void setExtinct(boolean extinct) {
		this.extinct = extinct;
	}

	public long getWeight() {
		return weight;
	}

	public void setWeight(long weight) {
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "Dinosaur [type=" + type + ", extinct=" + extinct + ", weight=" + weight + ", getFullName()=" + getFullName()
		    + "]";
	}

}
