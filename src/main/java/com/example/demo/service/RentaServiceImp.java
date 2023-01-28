package com.example.demo.service;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDateTime;

import org.hibernate.type.descriptor.java.LocalDateTimeJavaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.modelo.Automovil;
import com.example.demo.modelo.Cliente;
import com.example.demo.modelo.Pago;
import com.example.demo.modelo.Renta;
import com.example.demo.repository.IRentaRepo;

@Service
public class RentaServiceImp implements IRentaService {

	@Autowired
	private IAutomovilService automovilService;
	
	@Autowired
	private IClienteService clienteService;
	
	@Autowired
	private IRentaRepo iRentaRepo;
	
	
	
	@Override
	public Renta realizar(String placa, String cedula, String numeroDias, String numeroTarjeta) {
		// TODO Auto-generated method stub

		Automovil automovil=this.automovilService.buscar(placa);
		Cliente cliente=this.clienteService.buscar(cedula);
		
		
		Renta renta=new Renta();
		renta.setAutomovil(automovil);
		renta.setCliente(cliente);
		renta.setFecha(LocalDateTime.now());
		renta.setNumeroDias(numeroDias);
		renta.setValorRenta(new BigDecimal(numeroDias).multiply(automovil.getValorPorDia()));
		renta.setPago(null);
	
		
		
		this.iRentaRepo.ingresar(renta);
		return renta;
	}

}
