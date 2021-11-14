package com.br.edu.unidep.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.br.edu.unidep.course.entities.Order;
import com.br.edu.unidep.course.entities.User;

public interface OrderRepository extends JpaRepository<Order, Long> {
	
}
