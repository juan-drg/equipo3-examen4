package com.everis.quotationrestservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.everis.quotationrestservice.model.Cliente;
import com.everis.quotationrestservice.service.ClienteService;

@RestController
@RequestMapping("clientes")
public class ClienteController {
	
	
	@Autowired
	ClienteService clienteService;

	@GetMapping("/")
	public List<Cliente> listar() {
		
		return clienteService.listar();
	}
	
	@GetMapping("cliente/{idcliente}")
	public Cliente buscarByid(@PathVariable int idcliente) {
		
		return clienteService.bucarByid(idcliente);
		
	}
}
