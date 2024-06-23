package com.cibertec.LP2_T2_JorgeGallegos.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name = "tb_area")
public class AreaClass {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="area_id")
	private int codigoarea;
	
	@Column(name="nombre_area")
	private String areadescripcion;

	public AreaClass(int codigoarea, String areadescripcion) {
		super();
		this.codigoarea = codigoarea;
		this.areadescripcion = areadescripcion;
	}

	public AreaClass() {
		super();
	}

	public int getCodigoarea() {
		return codigoarea;
	}

	public void setCodigoarea(int codigoarea) {
		this.codigoarea = codigoarea;
	}

	public String getAreadescripcion() {
		return areadescripcion;
	}

	public void setAreadescripcion(String areadescripcion) {
		this.areadescripcion = areadescripcion;
	}

}
