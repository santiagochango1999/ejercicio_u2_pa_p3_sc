package com.example.demo.repository;

import org.springframework.stereotype.Repository;

import com.example.demo.modelo.Renta;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Transactional
@Repository
public class RentaRepoImp implements IRentaRepo {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void ingresar(Renta renta) {
		// TODO Auto-generated method stub
		this.entityManager.persist(renta);
	}

}
