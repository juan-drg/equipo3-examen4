package com.everis.quotationrestservice.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.everis.quotationrestservice.model.Cliente;
import com.everis.quotationrestservice.model.Servicio;
import com.everis.quotationrestservice.proxy.CalcularProxy;
import com.everis.quotationrestservice.requests.CotizacionRequest;
import com.everis.quotationrestservice.requests.CotizacionResponse;
@Service
public class CotizacionService {
	
	
	@Autowired
	private ClienteService clienteService;
	
	@Autowired
	private ServicioService servicioService;
	
	@Autowired
	private CalcularProxy calcularProxy;
	
	public CotizacionResponse obtenerCotizacion(@RequestBody CotizacionRequest cotizacion) {
		CotizacionRequest nuevaCotizacion = new CotizacionRequest();
		int idcliente =  cotizacion.getCliente().getIdcliente();
		Cliente clientePeticion = clienteService.bucarByid(idcliente);
		if(clientePeticion  != null) {
			nuevaCotizacion.setCliente(clientePeticion);
			List<Servicio> pedidosPeticion = cotizacion.getServicios();
			List<Servicio> pedidosConInfo = new ArrayList<>();
			for (Servicio servicio : pedidosPeticion) {
				Servicio servicioConInfo = servicioService.buscarId(servicio.getIdservicio());
				if(servicioConInfo.getIdservicio() != null) {
					pedidosConInfo.add(servicioConInfo);
				}
			}
			nuevaCotizacion.setServicios(pedidosConInfo);
		}
		CotizacionResponse resposne = new CotizacionResponse();
		resposne = calcularProxy.retrieveCotizacion(nuevaCotizacion);
		if(resposne.isStatus()) {
			resposne.setMessage("Cotizacion Exitoza");

		}else {
			resposne.setMessage("Fatal Error");
		}
		return resposne;
	}

}
