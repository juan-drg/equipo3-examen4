package com.equipo3.computerestservice.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.equipo3.computerestservice.model.Cliente;
import com.equipo3.computerestservice.model.Servicio;
import com.equipo3.computerestservice.response.CotizacionRequest;
import com.equipo3.computerestservice.response.CotizacionResponse;
import com.equipo3.computerestservice.service.ComputeService;

@RestController
@RequestMapping
public class ComputeController {

	//tipocliente = 1, sector privado con descuento del 10% sobre el total de la compra
	//tipocliente = 2, sector gobierno con descuento del 0% sobre el total de la compra
	//tipocliente = 3, preferente con descuento del 25% sobre el total de la compra
	
	@Autowired
	private ComputeService service;
	
	@PostMapping("/cotizacion")
	public CotizacionResponse cotizacion(CotizacionRequest cotizacion) {
	CotizacionResponse cotizacionresponse =new CotizacionResponse(); 
	cotizacionresponse.setCliente(cotizacion.getCliente());
	cotizacionresponse.setServicios(cotizacion.getServicios());
	 
	cotizacionresponse.getCotizacion().setSubtotal(service.calcularSubtotal(cotizacionresponse).getSubtotal());
	cotizacionresponse.getCotizacion().setDescuento(service.calcularDescuento(cotizacionresponse).getDescuento());
	cotizacionresponse.getCotizacion().setSubtotalcondescuento(cotizacionresponse.getCotizacion().getSubtotal()-cotizacionresponse.getCotizacion().getDescuento());
    
	cotizacionresponse.getCotizacion().setIva(service.calcularIVA(cotizacionresponse).getIva());
	cotizacionresponse.getCotizacion().setTotal(service.calcularTotal(cotizacionresponse).getTotal());
	
	return cotizacionresponse;
	} 

    
	


}
