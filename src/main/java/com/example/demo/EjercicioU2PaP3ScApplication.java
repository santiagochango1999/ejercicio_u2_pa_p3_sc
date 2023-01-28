package com.example.demo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.modelo.Automovil;
import com.example.demo.modelo.Cliente;
import com.example.demo.modelo.Renta;
import com.example.demo.service.IAutomovilService;
import com.example.demo.service.IClienteService;
import com.example.demo.service.IRentaService;

@SpringBootApplication
public class EjercicioU2PaP3ScApplication implements CommandLineRunner{

	@Autowired
	private IAutomovilService iAutomovilService;
	
	@Autowired
	private IClienteService iClienteService;
	
	@Autowired
	private IRentaService iRentaService;
	
	
	public static void main(String[] args) {
		SpringApplication.run(EjercicioU2PaP3ScApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		List<Renta> listRenta=new ArrayList<>();
		
		Automovil automovil=new Automovil();
		automovil.setPlaca("prt0372");
		automovil.setValorPorDia(new BigDecimal(25));
		
		automovil.setRenta(listRenta);
		
		
		Cliente cliente=new Cliente();
		cliente.setCedula("1727490953");
		cliente.setNombre("santiago");
		cliente.setRenta(listRenta);
		
		
		
		
		//parte 1
		
		this.iAutomovilService.crear(automovil);
		
		
		//parte 2
		
		this.iRentaService.realizar(automovil.getPlaca(), cliente.getCedula(), "6", "4564");
		listRenta.add(this.iRentaService.realizar(automovil.getPlaca(), cliente.getCedula(), "6", "4564"));
		
		//parte 3
		Automovil automovil2=this.iAutomovilService.buscar("prt0372");
		Cliente cliente2=this.iClienteService.buscar("1727490953");
		
	}

}
