package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.modelo.Automovil;
import com.example.demo.repository.IAutomovilRepo;

@Service
public class AutomovilServiceImp implements IAutomovilService {

	@Autowired
	private IAutomovilRepo iAutomovilRepo;

	@Override
	public void crear(Automovil automovil) {
		// TODO Auto-generated method stub
		this.iAutomovilRepo.insertar(automovil);
	}

	@Override
	public Automovil buscar(String placa) {
		// TODO Auto-generated method stub
		return this.iAutomovilRepo.buscar(placa);
	}

}
