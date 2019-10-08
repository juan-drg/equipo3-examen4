package com.everis.quotationrestservice.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.everis.quotationrestservice.model.Cliente;
import com.everis.quotationrestservice.model.Servicio;
import com.everis.quotationrestservice.requests.CotizacionRequest;
import com.everis.quotationrestservice.service.ClienteService;
import com.everis.quotationrestservice.service.ServicioService;

@RestController
@RequestMapping("cotizacion")
public class ClienteController {
	
	
	@Autowired
	private ClienteService clienteService;

	@Autowired
	private ServicioService servicioService;
	
	@GetMapping("/clientes")
	public List<Cliente> listar() {	
		return clienteService.listar();
	}
	
	@GetMapping("clientes/{idcliente}")
	public Cliente buscarByid(@PathVariable int idcliente) {
		return clienteService.bucarByid(idcliente);
	}
	
	@PostMapping("/")
	public CotizacionRequest obtenerCotizacion(@RequestBody CotizacionRequest cotizacion) {
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
		return nuevaCotizacion;
	}
	
	
	
}
