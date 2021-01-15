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
	
	@Column(nullable = false)	
	private Long id;
	private String entry, mainCourse, drink, dessert;
	

	@ManyToOne
    	@JoinColumn(name="user_id")
    	private Client client;

	protected Orders() {}

	public Orders(String entry, String mainCourse, String drink, String dessert) {
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
