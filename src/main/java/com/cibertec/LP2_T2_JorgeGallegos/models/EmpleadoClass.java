package com.cibertec.LP2_T2_JorgeGallegos.models;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
@Entity
@Table(name = "tb_empleado") 
public class EmpleadoClass {
	@Id
    @Column(name = "dni_empleado")
    private String dniEmpleado;

    @Column(name = "nombre_empleado")
    private String nombreEmpleado;

    @Column(name = "apellido_empleado")
    private String apellidoEmpleado;

    @Column(name = "fecha_nacimiento")
    private java.sql.Date fechaNacimientoEmpleado;

    @Column(name = "direccion")
    private String direccionEmpleado;

    @Column(name = "correo")
    private String correoEmpleado;

    @ManyToOne
    @JoinColumn(name = "area_id", nullable = false)
    private AreaClass codigoarea;

	public EmpleadoClass(String dniEmpleado, String nombreEmpleado, String apellidoEmpleado,
			Date fechaNacimientoEmpleado, String direccionEmpleado, String correoEmpleado, AreaClass codigoarea) {
		super();
		this.dniEmpleado = dniEmpleado;
		this.nombreEmpleado = nombreEmpleado;
		this.apellidoEmpleado = apellidoEmpleado;
		this.fechaNacimientoEmpleado = fechaNacimientoEmpleado;
		this.direccionEmpleado = direccionEmpleado;
		this.correoEmpleado = correoEmpleado;
		this.codigoarea = codigoarea;
	}

	public EmpleadoClass() {
		super();
	}

	public String getDniEmpleado() {
		return dniEmpleado;
	}

	public void setDniEmpleado(String dniEmpleado) {
		this.dniEmpleado = dniEmpleado;
	}

	public String getNombreEmpleado() {
		return nombreEmpleado;
	}

	public void setNombreEmpleado(String nombreEmpleado) {
		this.nombreEmpleado = nombreEmpleado;
	}

	public String getApellidoEmpleado() {
		return apellidoEmpleado;
	}

	public void setApellidoEmpleado(String apellidoEmpleado) {
		this.apellidoEmpleado = apellidoEmpleado;
	}

	public java.sql.Date getFechaNacimientoEmpleado() {
		return fechaNacimientoEmpleado;
	}

	public void setFechaNacimientoEmpleado(java.sql.Date fechaNacimientoEmpleado) {
		this.fechaNacimientoEmpleado = fechaNacimientoEmpleado;
	}

	public String getDireccionEmpleado() {
		return direccionEmpleado;
	}

	public void setDireccionEmpleado(String direccionEmpleado) {
		this.direccionEmpleado = direccionEmpleado;
	}

	public String getCorreoEmpleado() {
		return correoEmpleado;
	}

	public void setCorreoEmpleado(String correoEmpleado) {
		this.correoEmpleado = correoEmpleado;
	}

	public AreaClass getCodigoarea() {
		return codigoarea;
	}

	public void setCodigoarea(AreaClass codigoarea) {
		this.codigoarea = codigoarea;
	}

	
    
    
    
}
