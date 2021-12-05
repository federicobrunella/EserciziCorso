package model;

import java.util.Vector;

public class City {

	private String ID;
	private String name;
	private String country;
	
	private Vector<ForecastData> forecast;
	
	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Vector<ForecastData> getForecast() {
		return forecast;
	}

	public void setForecast(Vector<ForecastData> forecast) {
		this.forecast = forecast;
	}
}
