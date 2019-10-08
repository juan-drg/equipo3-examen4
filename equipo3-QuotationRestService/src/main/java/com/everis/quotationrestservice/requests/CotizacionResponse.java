package com.everis.quotationrestservice.requests;

import java.util.ArrayList;
import java.util.List;

import com.everis.quotationrestservice.model.Cliente;
import com.everis.quotationrestservice.model.Cotizacion;
import com.everis.quotationrestservice.model.Servicio;

public class CotizacionResponse {
	private Cliente cliente;
	private List<Servicio> servicios = new ArrayList<>();
	private Cotizacion cotizacion;
	private String message;
	private boolean status;
	
	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public CotizacionResponse() {
		super();
	}

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

	public Cotizacion getCotizacion() {
		return cotizacion;
	}

	public void setCotizacion(Cotizacion cotizacion) {
		this.cotizacion = cotizacion;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}	
	
}
