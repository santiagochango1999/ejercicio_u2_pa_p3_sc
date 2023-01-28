package com.example.demo.service;

import com.example.demo.modelo.Renta;

public interface IRentaService {

	public Renta realizar(String placa,String cedula,String numeroDias,String numeroTarjeta);
}
