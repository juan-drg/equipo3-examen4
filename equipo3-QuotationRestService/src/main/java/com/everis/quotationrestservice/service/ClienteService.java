package com.everis.quotationrestservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.everis.quotationrestservice.model.Cliente;
import com.everis.quotationrestservice.repository.ClienteRepository;

@Service
public class ClienteService {
	
	@Autowired
	ClienteRepository clienteRepository;

	public List<Cliente> listar(){
	
		return clienteRepository.findAll();
	}
}
