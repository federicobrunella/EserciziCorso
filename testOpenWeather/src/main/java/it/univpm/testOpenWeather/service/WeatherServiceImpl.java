package it.univpm.testOpenWeather.service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.Vector;

import org.json.simple.JSONObject;
import org.json.simple.JSONArray;
import org.json.simple.JSONValue;
import org.json.simple.parser.ParseException;
import org.springframework.stereotype.Service;

import it.univpm.testOpenWeather.model.City;
import it.univpm.testOpenWeather.model.ForecastData;

@Service
public class WeatherServiceImpl implements WeatherService {

	private String apiKey = "0350270b1abadb862209083d1e1fa0bf";
	private String url = "https://api.openweathermap.org/data/2.5/forecast?q=";

	@Override
	public JSONObject getJSONForecast(String city) {
		JSONObject forecast = null;

		try {
			URLConnection openConnection = new URL(url + city + "&appid=" + apiKey).openConnection();
			InputStream in = openConnection.getInputStream();

			String data = "";
			String line = "";
			try {
				InputStreamReader inR = new InputStreamReader( in );
				BufferedReader buf = new BufferedReader( inR );

				while ( ( line = buf.readLine() ) != null ) {
					data+= line;
				}
			} finally {
				in.close();
			}
			forecast = (JSONObject) JSONValue.parseWithException(data);	 //parse JSON Object


		} catch (IOException | ParseException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}			

		return forecast;
	}

	@Override
	public City getForecast(JSONObject obj) {
		City city = new City();
		Vector<ForecastData> forecastData = new Vector<ForecastData>();

		JSONObject cityData = (JSONObject)obj.get("city");
		JSONArray list = (JSONArray)obj.get("list");
		
		city.setName((String)cityData.get("name"));
		city.setCountry((String)cityData.get("country"));
		city.setID(String.valueOf(cityData.get("id")));


		for(int j = 0; j<list.size(); j++) {
			JSONObject listElement = (JSONObject)list.get(j);
			ForecastData singleForecast = new ForecastData();
			
			//JSONArray weather = (JSONArray)listElement.get("main");
			JSONObject weather = (JSONObject)((JSONArray)listElement.get("weather")).get(0);
			JSONObject main = (JSONObject)listElement.get("main");
			
			
			singleForecast.setDt((long)listElement.get("dt"));
			singleForecast.setTxtDateTime((String)listElement.get("dt_txt"));
			singleForecast.setTemp((double)main.get("temp"));
			//singleForecast.setFeelsLike((double)main.get("feels_like"));
			singleForecast.setTempMin((double)main.get("temp_min"));
			singleForecast.setTempMax((double)main.get("temp_max"));
			
			singleForecast.setMain((String)weather.get("main"));
			singleForecast.setDescription((String)weather.get("description"));

			forecastData.add(singleForecast);
		}
		
		city.setForecast(forecastData);
		return city;
	}

	@Override
	public JSONObject toJSON(City city) {
		JSONObject output = new JSONObject();

		output.put("city", city.getName());
		output.put("ID", city.getID());
		output.put("country",city.getCountry());

		JSONArray forecastList = new JSONArray();

		for(ForecastData singleForecast : city.getForecast()) {
			JSONObject forecast = new JSONObject();

			forecast.put("dt",singleForecast.getDt());
			forecast.put("txtDateTime", singleForecast.getTxtDateTime());
			forecast.put("temp", singleForecast.getTemp());
			forecast.put("temp_min", singleForecast.getTempMin());
			forecast.put("temp_max", singleForecast.getTempMax());
			forecast.put("feels_like", singleForecast.getFeelsLike());
			
			forecast.put("main", singleForecast.getMain());
			forecast.put("description", singleForecast.getDescription());

			forecastList.add(forecast);
		}

		output.put("list",forecastList);

		return output;
	}

	@Override
	public void saveToFile(JSONObject obj) {
		//TODO: salvataggio su file locale da aggiungere
	}
}
