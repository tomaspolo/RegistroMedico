package com.viewnext.registrosmedicos.bussines.model;

import java.util.Date;

public class Registro {

	private long codigo;
	private Date fechaRegistro;
	private Geolocalizacion geolocalizacion;
	private double peso;
	private PresionArterial presionArterial;
	private int numeroPasos;
	
	public Registro() {}
	
	
	public long getCodigo() {
		return codigo;
	}
	public void setCodigo(long codigo) {
		this.codigo = codigo;
	}
	public Date getFechaRegistro() {
		return fechaRegistro;
	}
	public void setFechaRegistro(Date fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}
	public Geolocalizacion getGeolocalizacion() {
		return geolocalizacion;
	}
	public void setGeolocalizacion(Geolocalizacion geolocalizacion) {
		this.geolocalizacion = geolocalizacion;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public PresionArterial getPresionArterial() {
		return presionArterial;
	}
	public void setPresionArterial(PresionArterial presionArterial) {
		this.presionArterial = presionArterial;
	}
	public int getNumeroPasos() {
		return numeroPasos;
	}
	public void setNumeroPasos(int numeroPasos) {
		this.numeroPasos = numeroPasos;
	}
	
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (codigo ^ (codigo >>> 32));
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Registro other = (Registro) obj;
		if (codigo != other.codigo)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Registro [codigo=" + codigo + ", fechaRegistro=" + fechaRegistro + ", geolocalizacion="
				+ geolocalizacion + ", peso=" + peso + ", presionArterial=" + presionArterial + ", numeroPasos="
				+ numeroPasos + "]";
	}
	
	
	
	
}
