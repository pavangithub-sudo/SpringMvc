package com.pav.model;

public class Country {
	private int id;
	private String countryname;
	private long population;
	public Country(int id, String countryname, long population) {
		super();
		this.id = id;
		this.countryname = countryname;
		this.population = population;
	}
	public Country() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCountryname() {
		return countryname;
	}
	public void setCountryname(String countryname) {
		this.countryname = countryname;
	}
	public long getPopulation() {
		return population;
	}
	public void setPopulation(long population) {
		this.population = population;
	}
	@Override
	public String toString() {
		return "Country [id=" + id + ", countryname=" + countryname + ", population=" + population + "]";
	}
	

}
