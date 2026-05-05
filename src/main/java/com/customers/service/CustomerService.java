package com.customers.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.customers.model.Customers;
import com.customers.repository.CustomerRepository;

@Service
public class CustomerService {

	@Autowired
	private CustomerRepository repo;
	
	public List<Customers> getAll(){
		return repo.findAll();
	}
	
	public Customers getOne(Long id) {
		return repo.findById(id).orElseThrow(() -> new RuntimeException("Not found"));
	}
	
	public Customers create(Customers cus) {
		return repo.save(cus);
	}
	
	public Customers update(Long id, Customers cus) {
		return repo.findById(id).map((c) -> {
			c.setName(cus.getName());
			c.setEmail(cus.getEmail());
			c.setOrderDish(cus.getOrderDish());
			return repo.save(c);
		}).orElseThrow(() -> new RuntimeException("Not found"));
	}
	
	public void delete(Long id) {
		repo.deleteById(id);
	}
}


