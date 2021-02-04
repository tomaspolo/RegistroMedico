package com.viewnext.registrosmedicos.integration.model;

import java.util.Date;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.TableGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;



@Entity
@Table(name="REGISTROS")
public class RegistroPL {
	
	@Id
	@TableGenerator(name = "GENERADOR_REGISTROS",
	table = "SECUENCIAS",
	pkColumnName = "NOMBRE_SECUENCIA",
	pkColumnValue = "SEQ_REGISTROS",
	valueColumnName = "VALOR_SECUENCIA",
	allocationSize = 1)

@GeneratedValue(strategy = GenerationType.TABLE, generator = "GENERADOR_REGISTROS")
	private long codigo;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date fechaRegistro;
	
	@Embedded
	private GeolocalizacionPL geolocalizacion;
	
	private double peso;
	
	@Embedded
	private PresionArterialPL presionArterial;
	
	private int numeroPasos;
	
	@ManyToOne
	@JoinColumn(name="DNI_USUARIO")
	private UsuarioPL usuario;
	
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
	

	public UsuarioPL getUsuario() {
		return usuario;
	}

	public void setUsuario(UsuarioPL usuario) {
		this.usuario = usuario;
	}

	@Override
	public String toString() {
		return "Registro [codigo=" + codigo + ", fechaRegistro=" + fechaRegistro + ", geolocalizacion="
				+ geolocalizacion + ", peso=" + peso + ", presionArterial=" + presionArterial + ", numeroPasos="
				+ numeroPasos + "]";
	}
	
	
	
	
}
