package it.univpm.testOpenWeather.model;

public class ForecastData {
	
	private long dt;
	private String txtDateTime;

	private double temp;
	private float feelsLike;
	private double tempMin;
	private double tempMax;
	
	private String main;
	private String description;
	
	
	public long getDt() {
		return dt;
	}
	
	public void setDt(long dt) {
		this.dt = dt;
	}
	
	public double getTemp() {
		return temp;
	}
	
	public void setTemp(double temp) {
		this.temp = temp;
	}
	
	public double getFeelsLike() {
		return feelsLike;
	}
	
	public void setFeelsLike(float feelsLike) {
		this.feelsLike = feelsLike;
	}
	
	public double getTempMin() {
		return tempMin;
	}
	
	public void setTempMin(double tempMin) {
		this.tempMin = tempMin;
	}
	
	public double getTempMax() {
		return tempMax;
	}
	
	public void setTempMax(double tempMax) {
		this.tempMax = tempMax;
	}
	
	public String getMain() {
		return main;
	}
	
	public void setMain(String main) {
		this.main = main;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public String getTxtDateTime() {
		return txtDateTime;
	}
	
	public void setTxtDateTime(String txtDateTime) {
		this.txtDateTime = txtDateTime;
	}

}