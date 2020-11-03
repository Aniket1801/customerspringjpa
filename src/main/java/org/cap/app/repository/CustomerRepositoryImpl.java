package org.cap.app.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import org.cap.app.entities.*;

@Repository
public class CustomerRepositoryImpl implements ICustomerRepository {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public Customer add(Customer customer) {
		entityManager.persist(customer);
		return customer;
	}

	@Override
	public Customer update(Customer customer) {
		return entityManager.merge(customer);
	}

	@Override
	public Customer findById(Long id) {
		return entityManager.find(Customer.class, id);
	}

}
