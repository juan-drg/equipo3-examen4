package com.everis.quotationrestservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.everis.quotationrestservice.model.Servicio;
import com.everis.quotationrestservice.repository.ServicioRepository;

@Service
public class ServicioService {
	
	@Autowired
	private ServicioRepository servicioRepository;
	
	public Servicio buscarId(int idservicio) {
		return servicioRepository.findById(idservicio).get();
	}	
	
}
