package com.equipo3.computerestservice.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.equipo3.computerestservice.model.Cotizacion;
import com.equipo3.computerestservice.model.Servicio;
import com.equipo3.computerestservice.response.CotizacionResponse;

@Service
public class ComputeService {

	public Cotizacion calcularSubtotal(CotizacionResponse response) {
		Double acumuladorSubtotal = 0.0;
		// Crea un nuevo objeto tipo cotizacion para almacenar
//		el subtotal, el objeto se retorna y se asigna al objeto cotizacion del response.
		Cotizacion cotizacion = new Cotizacion(); 
		List<Servicio> servicios = response.getServicios();
		for (Servicio servicio : servicios) {
			acumuladorSubtotal += servicio.getCosto();
		}
		cotizacion.setSubtotal(acumuladorSubtotal);
		return cotizacion;
	}
	
	public Cotizacion calcularDescuento(CotizacionResponse response) {
		Cotizacion cotizacion = new Cotizacion();
		Integer tipoCliente= response.getCliente().getTipocliente();
		
		if(tipoCliente == 1) {
			cotizacion.setDescuento(response.getCotizacion().getSubtotal()*.10);
		}else if(tipoCliente == 2) {
			cotizacion.setDescuento(response.getCotizacion().getSubtotal()*0);
		}else if(tipoCliente == 3) {
			cotizacion.setDescuento(response.getCotizacion().getSubtotal()*.25);
		}else {
			cotizacion =null;
		}
		return cotizacion;
	}
	
	public Cotizacion calcularIVA(CotizacionResponse response) {
		Cotizacion cotizacion = new Cotizacion();
		cotizacion.setIva(response.getCotizacion().getSubtotalcondescuento()*.16);
		
		return cotizacion;
	}
	
	public Cotizacion calcularTotal(CotizacionResponse response) {
		Cotizacion cotizacion = new Cotizacion();
		cotizacion.setTotal(response.getCotizacion().getSubtotalcondescuento()
				+response.getCotizacion().getIva());
		return cotizacion;
	}
}
