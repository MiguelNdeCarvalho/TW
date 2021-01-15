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
	private String firstName, lastName, mail;
		
	protected Client() {}

	public Client(String firstName, String lastName, String mail) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.mail = mail;
	}

	@Override
	public String toString() {
		return String.format(
				"Client[id=%d, firstName='%s', lastName='%s', mail='%s']",
				id, firstName, lastName, mail);
	}

	public Long getId() {
		return id;
	}

	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public String getMail() {
		return mail;
	}
}
