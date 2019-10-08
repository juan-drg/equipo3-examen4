package com.equipo3.computerestservice.model;

public class Servicio implements java.io.Serializable {

	private int idservicio;
	private String nombre;
	private String costo;

	public Servicio() {
	}

	public Servicio(int idservicio) {
		this.idservicio = idservicio;
	}

	public Servicio(int idservicio, String nombre, String costo) {
		this.idservicio = idservicio;
		this.nombre = nombre;
		this.costo = costo;
	}

	public int getIdservicio() {
		return this.idservicio;
	}

	public void setIdservicio(int idservicio) {
		this.idservicio = idservicio;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCosto() {
		return this.costo;
	}

	public void setCosto(String costo) {
		this.costo = costo;
	}

}
