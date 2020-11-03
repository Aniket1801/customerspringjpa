package com.cg.customerapp.ui;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import org.cap.app.entities.*;
import org.cap.app.service.*;


@Component
public class ProjectUi {
	@Autowired
	private ICustomerService customerService;

	public void run()
	{
		Customer customer = add("Aniket");
		Customer customer1 = add("Aman");
		Customer customer2= add("Rohit");
		Long id1 = customer.getId();
		System.out.println("Before update: "+customer.toString());
		customer = update(id1, "John");
		System.out.println("After update: "+customer.toString());
		System.out.println("Before update: "+customer1.toString());
		Long id2 = customer1.getId();
		customer1 = update(id2, "Rohan");
		System.out.println("After update: "+customer1.toString());
		System.out.println(customer2.toString());
	}
	
	public Customer add(String name)
	{
		Customer customer = new Customer(name);
		customer = customerService.register(customer);
		return customer;
	}
	
	public Customer update(Long id, String newName)
	{
		return customerService.updateName(id, newName);
	}
	
}
