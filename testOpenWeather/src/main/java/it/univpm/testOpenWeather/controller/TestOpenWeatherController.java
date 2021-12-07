package it.univpm.testOpenWeather.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import it.univpm.testOpenWeather.service.WeatherService;


@RestController
public class TestOpenWeatherController {
	
	@Autowired
	private WeatherService weatherService;
	
	@RequestMapping(value = "/getLondon")
	public ResponseEntity<Object> getForecast() {
		return new ResponseEntity<>(weatherService.toJSON(weatherService.getForecast(weatherService.getJSONForecast("London"))), HttpStatus.OK);
	}
	
	@RequestMapping(value = "/getWeather")
	public ResponseEntity<Object> getForecastbyCity(@RequestParam(name="city", defaultValue="London") String city) {
		return new ResponseEntity<>(weatherService.toJSON(weatherService.getForecast(weatherService.getJSONForecast(city))), HttpStatus.OK);
	}

}
