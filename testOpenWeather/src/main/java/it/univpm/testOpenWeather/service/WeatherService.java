package it.univpm.testOpenWeather.service;

import org.json.simple.JSONObject;

import it.univpm.testOpenWeather.model.*;

public interface WeatherService {
	
	public abstract JSONObject toJSON(City city);
	public abstract JSONObject getJSONForecast(String city);
	public abstract City getForecast(JSONObject forecast);
	public abstract void saveToFile(JSONObject obj);
}
