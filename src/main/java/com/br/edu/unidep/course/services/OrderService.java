package com.br.edu.unidep.course.services;

import com.br.edu.unidep.course.entities.Order;
import com.br.edu.unidep.course.entities.User;
import com.br.edu.unidep.course.repositories.OrderRepository;
import com.br.edu.unidep.course.repositories.UserRepository;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
	
	@Autowired
	private OrderRepository repository;
	
	public List<Order> findAll() {
		return repository.findAll();
	}
	
	public Order findById(Long id) {
		Optional<Order> obj = repository.findById(id);
		return obj.get();
	}
}
