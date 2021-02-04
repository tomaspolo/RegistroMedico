package com.viewnext.registrosmedicos.integration.model;

import java.util.Date;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
@Table(name="REGISTROS")
public class RegistroPL {
	
	@Id
	private String codigo;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date fechaRegistro;
	
	@Embedded
	private GeolocalizacionPL geolocalizacion;
	
	private double peso;
	
	@Embedded
	private PresionArterialPL presionArterial;
	
	private int numeroPasos;
	
	public RegistroPL() {}
	
	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	
	public Date getFechaRegistro() {
		return fechaRegistro;
	}
	
	public void setFechaRegistro(Date fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}
	
	public GeolocalizacionPL getGeolocalizacion() {
		return geolocalizacion;
	}
	
	public void setGeolocalizacion(GeolocalizacionPL geolocalizacion) {
		this.geolocalizacion = geolocalizacion;
	}
	
	public double getPeso() {
		return peso;
	}
	
	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	public PresionArterialPL getPresionArterial() {
		return presionArterial;
	}
	
	public void setPresionArterial(PresionArterialPL presionArterial) {
		this.presionArterial = presionArterial;
	}
	
	public int getNumeroPasos() {
		return numeroPasos;
	}
	
	public void setNumeroPasos(int numeroPasos) {
		this.numeroPasos = numeroPasos;
	}
	
	
	@Override
	public String toString() {
		return "Registro [codigo=" + codigo + ", fechaRegistro=" + fechaRegistro + ", geolocalizacion="
				+ geolocalizacion + ", peso=" + peso + ", presionArterial=" + presionArterial + ", numeroPasos="
				+ numeroPasos + "]";
	}
	
	
	
	
}
