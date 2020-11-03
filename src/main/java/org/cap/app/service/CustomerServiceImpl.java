package org.cap.app.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import org.cap.app.entities.*;
import org.cap.app.repository.*;

@Service

public class CustomerServiceImpl implements ICustomerService{

	@Autowired
	private ICustomerRepository customerRepository;
	
	@Override
	@Transactional
	public Customer register(Customer customer) {
		customer = customerRepository.add(customer);
		return customer;
	}
	

	@Override
	@Transactional
	public Customer updateName(Long id, String name) {
		Customer customer = customerRepository.findById(id);
		customer.setName(name);
		customer = customerRepository.update(customer);
		return customer;
	}

}
