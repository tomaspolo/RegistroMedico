package com.viewnext.RegistrosMedicos.integration.model;

public class PresionArterialPL {
	
	private double presionMin;
	private double presionMax;
	
	public PresionArterialPL() {}

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
