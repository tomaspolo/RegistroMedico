package com.viewnext.registrosmedicos.integration.model;

import java.util.Date;


import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
@Table(name="USUARIOS")
public class RegistroPL {
	
	@Id
	private long codigo;
	
	@Temporal(TemporalType.DATE)
	
	private Date fechaRegistro;
	@Embedded
	private GeolocalizacionPL geolocalizacion;
	private double peso;
	
	@Embedded
	private PresionArterialPL presionArterial;
	private int numeroPasos;
	
	public RegistroPL() {}
	
	
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
		RegistroPL other = (RegistroPL) obj;
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
