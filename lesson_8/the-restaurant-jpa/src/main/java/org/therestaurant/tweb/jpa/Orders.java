package org.therestaurant.tweb.jpa;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Orders {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;

	@Column(nullable = false)
	private String entry, mainCourse, drink, dessert;
	

	@ManyToOne
    	@JoinColumn(name="clientID")
    	private Client client;

	protected Orders() {}

	public Orders(Client client, String entry, String mainCourse, String drink, String dessert) {
		this.client = client;
		this.entry = entry;
		this.mainCourse = mainCourse;
		this.drink = drink;
		this.dessert= dessert;
	}

	public Long getId() {
		return id;
	}

	public String getEntry() {
		return entry;
	}
	
	public String getMainCourse() {
		return mainCourse;
	}
	
	public String getDrink() {
		return drink;
	}
	
	public String getDessert() {
		return dessert;
	}
}
