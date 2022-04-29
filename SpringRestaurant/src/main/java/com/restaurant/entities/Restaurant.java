package com.restaurant.entities;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="restaurant")
public class Restaurant {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
int restaurant_id;
String name;
String city;
int no_of_tables;



@Override
public String toString() {
	return "Restaurant [restaurant_id=" + restaurant_id + ", name=" + name + ", city=" + city + 
			", no_of_tables="+ no_of_tables + "]";
}

public int getRestaurant_id() {
	return restaurant_id;
}

public void setRestaurant_id(int restaurant_id) {
	this.restaurant_id = restaurant_id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getCity() {
	return city;
}

public void setCity(String city) {
	this.city = city;
}

public int getNo_of_tables() {
	return no_of_tables;
}

public void setNo_of_tables(int no_of_tables) {
	this.no_of_tables = no_of_tables;
}

public Restaurant(int restaurant_id, String name, String city, int no_of_tables) {
	super();
	this.restaurant_id = restaurant_id;
	this.name = name;
	this.city = city;
	this.no_of_tables = no_of_tables;
}

public Restaurant() {
	super();
	// TODO Auto-generated constructor stub
}




}
