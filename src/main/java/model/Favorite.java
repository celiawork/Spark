package model;

import javax.persistence.Entity;

@Entity(name="FAVORIS")
public class Favorite extends Address {
	private String label;

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

}
