package com.everis.quotationrestservice.model;
// Generated 8/10/2019 12:07:39 PM by Hibernate Tools 5.2.12.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Cliente generated by hbm2java
 */
@Entity
@Table(name = "cliente", catalog = "examenequipotres")
public class Cliente implements java.io.Serializable {

	private Integer idcliente;
	private String nombre;
	private String apaterno;
	private String amaterno;
	private Integer tipocliente;

	public Cliente() {
	}

	public Cliente(String nombre, String apaterno, String amaterno, Integer tipocliente) {
		this.nombre = nombre;
		this.apaterno = apaterno;
		this.amaterno = amaterno;
		this.tipocliente = tipocliente;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "idcliente", unique = true, nullable = false)
	public Integer getIdcliente() {
		return this.idcliente;
	}

	public void setIdcliente(Integer idcliente) {
		this.idcliente = idcliente;
	}

	@Column(name = "nombre", length = 45)
	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Column(name = "apaterno", length = 45)
	public String getApaterno() {
		return this.apaterno;
	}

	public void setApaterno(String apaterno) {
		this.apaterno = apaterno;
	}

	@Column(name = "amaterno", length = 45)
	public String getAmaterno() {
		return this.amaterno;
	}

	public void setAmaterno(String amaterno) {
		this.amaterno = amaterno;
	}

	@Column(name = "tipocliente")
	public Integer getTipocliente() {
		return this.tipocliente;
	}

	public void setTipocliente(Integer tipocliente) {
		this.tipocliente = tipocliente;
	}

}
