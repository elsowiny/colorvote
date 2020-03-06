package com.elsowiny.colorvote.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="votes")
public class Vote {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="city")
	private String city;
	
	@Column(name="color")
	private String color;
	
	@Column(name="votes")
	private int votes;
	
	//no arg constructor
	public Vote() {}

	//constructor
	public Vote(String city, String color, int votes) {
		this.city = city;
		this.color = color;
		this.votes = votes;
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getVotes() {
		return votes;
	}

	public void setVotes(int votes) {
		this.votes = votes;
	}

	@Override
	public String toString() {
		return "Vote [id=" + id + ", city=" + city + ", color=" + color + ", votes=" + votes + "]";
	};
	
	
}
