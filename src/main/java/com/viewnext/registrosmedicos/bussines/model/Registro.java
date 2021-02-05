package com.viewnext.registrosmedicos.bussines.model;

import java.util.Date;

public class Registro {

	private long codigo;
	private Date fechaRegistro;
	private Geolocalizacion geolocalizacion;
	private double peso;
	private PresionArterial presionArterial;
	private int numeroPasos;	
	private Usuario usuario;
	
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
	
	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	@Override
	public String toString() {
		return "Registro [codigo=" + codigo + ", fechaRegistro=" + fechaRegistro + ", geolocalizacion="
				+ geolocalizacion + ", peso=" + peso + ", presionArterial=" + presionArterial + ", numeroPasos="
				+ numeroPasos + "]";
	}
	
	
	
	
	
	
}
