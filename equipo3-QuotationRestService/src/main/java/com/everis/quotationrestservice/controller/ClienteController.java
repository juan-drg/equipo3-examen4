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
import com.everis.quotationrestservice.requests.CotizacionRequest;
import com.everis.quotationrestservice.requests.CotizacionResponse;
import com.everis.quotationrestservice.service.ClienteService;
import com.everis.quotationrestservice.service.CotizacionService;

@RestController
@RequestMapping("cotizacion")
public class ClienteController {
	
	
	@Autowired
	private ClienteService clienteService;

	@Autowired
	private CotizacionService cotizacionService;

	
	@GetMapping("/clientes")
	public List<Cliente> listar() {	
		return clienteService.listar();
	}
	
	@GetMapping("clientes/{idcliente}")
	public Cliente buscarByid(@PathVariable int idcliente) {
		return clienteService.bucarByid(idcliente);
	}
	
	@PostMapping("/")
	public CotizacionResponse obtenerCotizacion(@RequestBody CotizacionRequest cotizacion) {

		return cotizacionService.obtenerCotizacion(cotizacion);
	}
	
	
	
}
