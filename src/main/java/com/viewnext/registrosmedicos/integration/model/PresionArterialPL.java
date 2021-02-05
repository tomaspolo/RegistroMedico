package com.viewnext.registrosmedicos.integration.model;

import javax.persistence.Embeddable;

@Embeddable
public class PresionArterialPL {

	private double presionMin;
	private double presionMax;

	public PresionArterialPL() {
	}

	public PresionArterialPL(double presionMin, double presionMax) {
		this.presionMin = presionMin;
		this.presionMax = presionMax;
	}

	public double getPresionMin() {
		return presionMin;
	}

	public void setPresionMin(double presionMin) {
		this.presionMin = presionMin;
	}

	public double getPresionMax() {
		return presionMax;
	}

	public void setPresionMax(double presionMax) {
		this.presionMax = presionMax;
	}

	@Override
	public String toString() {
		return "PresionArterial [presionMin=" + presionMin + ", presionMax=" + presionMax + "]";
	}

}
