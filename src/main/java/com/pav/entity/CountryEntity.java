package com.pav.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "country111")
public class CountryEntity {
	@Id
	 @Column(name="id")
	 @GeneratedValue(strategy=GenerationType.IDENTITY)
	 int id;
	 //hello this is git changes
	 @Column(name="countryName")
	 String countryName; 
	 
	 @Column(name="population")
	 long population;
	 
	 public CountryEntity() {
		super();
	}
	public CountryEntity(int id, String countryName, long population) {
		super();
		this.id = id;
		this.countryName = countryName;
		this.population = population;
	}
	public int getId() {
	  return id;
	 }
	 public void setId(int id) {
	  this.id = id;
	 }
	 public String getCountryName() {
	  return countryName;
	 }
	 public void setCountryName(String countryName) {
	  this.countryName = countryName;
	 }
	 public long getPopulation() {
	  return population;
	 }
	 public void setPopulation(long population) {
	  this.population = population;
	 }
	@Override
	public String toString() {
		return "CountryEntity [id=" + id + ", countryName=" + countryName + ", population=" + population + "]";
	}

}
