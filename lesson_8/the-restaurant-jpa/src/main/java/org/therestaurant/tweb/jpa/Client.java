package org.therestaurant.tweb.jpa;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Client {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private String firstName;
		
	protected Client() {}

	public Client(String firstName) {
		this.firstName = firstName;
	}

	@Override
	public String toString() {
		return String.format(
				"Client[id=%d, firstName='%s']",
				id, firstName);
	}

	public Long getId() {
		return id;
	}

	public String getFirstName() {
		return firstName;
	}
	
}
