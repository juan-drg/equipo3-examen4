package com.equipo3.computerestservice.response;

import java.util.List;

import com.equipo3.computerestservice.model.Cliente;
import com.equipo3.computerestservice.model.Servicio;

public class CotizacionRequest {
	private Cliente cliente;
	private List<Servicio> servicios;

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public List<Servicio> getServicios() {
		return servicios;
	}

	public void setServicios(List<Servicio> servicios) {
		this.servicios = servicios;
	}
}
