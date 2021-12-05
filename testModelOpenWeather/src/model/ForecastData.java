package model;

public class ForecastData {
	
	private int dt;
	
	private double temp;
	private double feelsLike;
	private double tempMin;
	private double tempMax;
	
	private String main;
	private String description;
	private String txtDateTime;
	
	
	public int getDt() {
		return dt;
	}
	
	public void setDt(int dt) {
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
	
	public void setFeelsLike(double feelsLike) {
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
