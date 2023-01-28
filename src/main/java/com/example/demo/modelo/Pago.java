package com.example.demo.modelo;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name="pago")
public class Pago {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "pag_seq")
	@SequenceGenerator(name = "pag_seq", sequenceName = "pag_seq", allocationSize = 1)
	@Column(name="pag_id")
	private Integer id;
	@Column(name="pag_numero_tarjeta")
	private String numeroTarjeta;
	@Column(name="pag_valor_pago")
	private BigDecimal valorPago;
	
	@OneToOne(mappedBy = "pago")
	private Renta renta;

	
	

	@Override
	public String toString() {
		return "Pago [id=" + id + ", numeroTarjeta=" + numeroTarjeta + ", valorPago=" + valorPago + ", renta=" + renta
				+ "]";
	}

	//GET Y SET
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNumeroTarjeta() {
		return numeroTarjeta;
	}

	public void setNumeroTarjeta(String numeroTarjeta) {
		this.numeroTarjeta = numeroTarjeta;
	}

	public BigDecimal getValorPago() {
		return valorPago;
	}

	public void setValorPago(BigDecimal valorPago) {
		this.valorPago = valorPago;
	}

	public Renta getRenta() {
		return renta;
	}

	public void setRenta(Renta renta) {
		this.renta = renta;
	}
	
	

}
