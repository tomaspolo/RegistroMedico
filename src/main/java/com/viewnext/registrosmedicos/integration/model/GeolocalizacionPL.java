package com.viewnext.RegistrosMedicos.integration.model;

public class GeolocalizacionPL {

	private double latitud;
	private double longitud;
	
	public GeolocalizacionPL() {}

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
