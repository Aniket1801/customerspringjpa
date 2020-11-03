package org.cap.app.service;

import org.cap.app.entities.*;

public interface ICustomerService {
	public Customer register(Customer customer);
	public Customer updateName(Long id, String name);
}
