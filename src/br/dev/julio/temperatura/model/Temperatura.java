package br.dev.julio.temperatura.model;

public class Temperatura {

	private double celsius;
	
	public double getCelsius() {
		return celsius;
	}
	
	public void setCelsius(double celsius) {
		this.celsius = celsius;
	}
	
	public double converterParaKelvin() {
		double kelvin = celsius + 273.15;
		return kelvin;
	}
	
	public double converterParaFahrenheit() {
		double fahrenheit = celsius * 9 / 5 + 32;
		return fahrenheit;
	}
	
}


