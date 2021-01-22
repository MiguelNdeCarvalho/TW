package org.therestaurant.tweb.jpa;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class Client {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String firstName, lastName, mail, username, password, role;

	@OneToMany(mappedBy = "client")
    	private List<Orders> orders;

	protected Client() {}

	public Client(String firstName, String lastName, String mail, String username, String password, String role) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.mail = mail;
		this.username = username;
		this.password = password;
		this.role = role;
	}

	@Override
	public String toString() {
		return String.format(
				"Client[id=%d, firstName='%s', lastName='%s', mail='%s', username='%s', password= '%s', role= '%s']",
				id, firstName, lastName, mail, username, password, role);
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

	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}

	public String getRole() {
		return role;
	}
}
