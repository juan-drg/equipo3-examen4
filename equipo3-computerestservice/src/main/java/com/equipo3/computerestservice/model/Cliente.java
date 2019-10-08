package com.equipo3.computerestservice.model;

public class Cliente implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int idcliente;
	private String nombre;
	private String apaterno;
	private String amaterno;
	private Integer tipocliente;

	public Cliente() {
	}

	public Cliente(int idcliente) {
		this.idcliente = idcliente;
	}

	public Cliente(int idcliente, String nombre, String apaterno, String amaterno, Integer tipocliente) {
		this.idcliente = idcliente;
		this.nombre = nombre;
		this.apaterno = apaterno;
		this.amaterno = amaterno;
		this.tipocliente = tipocliente;
	}

	public int getIdcliente() {
		return this.idcliente;
	}

	public void setIdcliente(int idcliente) {
		this.idcliente = idcliente;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApaterno() {
		return this.apaterno;
	}

	public void setApaterno(String apaterno) {
		this.apaterno = apaterno;
	}

	public String getAmaterno() {
		return this.amaterno;
	}

	public void setAmaterno(String amaterno) {
		this.amaterno = amaterno;
	}

	public Integer getTipocliente() {
		return this.tipocliente;
	}

	public void setTipocliente(Integer tipocliente) {
		this.tipocliente = tipocliente;
	}

}
