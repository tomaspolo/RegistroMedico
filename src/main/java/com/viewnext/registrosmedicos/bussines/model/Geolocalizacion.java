package com.viewnext.registrosmedicos.bussines.model;

public class Geolocalizacion {

	private double latitud;
	private double longitud;
	
	public Geolocalizacion() {}

	public double getLatitud() {
		return latitud;
	}

	public void setLatitud(double latitud) {
		this.latitud = latitud;
	}

	public double getLongitud() {
		return longitud;
	}

	public void setLongitud(double longitud) {
		this.longitud = longitud;
	}

	@Override
	public String toString() {
		return "Geolocalizacion [latitud=" + latitud + ", longitud=" + longitud + "]";
	}
	
	
	
}
