package com.example.demo.modelo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name="renta")
public class Renta {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "rent_seq")
	@SequenceGenerator(name = "rent_seq", sequenceName = "rent_seq", allocationSize = 1)
	@Column(name="rent_id")
	private Integer id;
	@Column(name="rent_fecha")
	private LocalDateTime fecha;
	@Column(name="rent_numero_dias")
	private String numeroDias;
	@Column(name="rent_valor_renta")
	private BigDecimal valorRenta;
	
	@ManyToOne
	@JoinColumn(name="rent_id_automovil")
	private Automovil automovil;
	
	@ManyToOne
	@JoinColumn(name="rent_id_cliente")
	private Cliente cliente;
	
	@OneToOne
	@JoinColumn(name="rent_id_pago")
	private Pago pago;

	
	
	
	@Override
	public String toString() {
		return "Renta [id=" + id + ", fecha=" + fecha + ", numeroDias=" + numeroDias + ", valorRenta=" + valorRenta
				+ ", automovil=" + automovil + ", cliente=" + cliente + ", pago=" + pago + "]";
	}

	//GET Y SET
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public LocalDateTime getFecha() {
		return fecha;
	}

	public void setFecha(LocalDateTime fecha) {
		this.fecha = fecha;
	}

	public String getNumeroDias() {
		return numeroDias;
	}

	public void setNumeroDias(String numeroDias) {
		this.numeroDias = numeroDias;
	}

	public BigDecimal getValorRenta() {
		return valorRenta;
	}

	public void setValorRenta(BigDecimal valorRenta) {
		this.valorRenta = valorRenta;
	}

	public Automovil getAutomovil() {
		return automovil;
	}

	public void setAutomovil(Automovil automovil) {
		this.automovil = automovil;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Pago getPago() {
		return pago;
	}

	public void setPago(Pago pago) {
		this.pago = pago;
	}
	
	
	
	
}
