package com.example.demo.service;

import com.example.demo.modelo.Automovil;

public interface IAutomovilService {

	public void crear(Automovil automovil);

	public Automovil buscar(String placa);
}
