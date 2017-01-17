package com.jzf.repository;

import java.util.ArrayList;
import java.util.List;

import com.jzf.model.Customer;

public class HibernateCustomerRepositoryImpl implements CustomerRepository {
	
	/* (non-Javadoc)
	 * @see com.jzf.repository.CustomerRepository#findAll()
	 */
	@Override
	public List<Customer> findAll() {
		List<Customer> customers = new ArrayList<>();
		
		Customer customer = new Customer();
		
		customer.setFirstName("Joseph");
		customer.setLastName("David");
		
		customers.add(customer);
		
		return customers;
	}

}
