package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.modelo.Cliente;
import com.example.demo.repository.IClienteRepo;

@Service
public class ClienteServiceImp implements IClienteService {

	@Autowired
	private IClienteRepo iClienteRepo;

	@Override
	public void crear(Cliente cliente) {
		// TODO Auto-generated method stub
		this.iClienteRepo.insertar(cliente);
	}

	@Override
	public Cliente buscar(String cedula) {
		// TODO Auto-generated method stub
		return this.iClienteRepo.buscar(cedula);
	}

}
