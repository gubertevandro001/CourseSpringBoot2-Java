package com.br.edu.unidep.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.br.edu.unidep.course.entities.Order;
import com.br.edu.unidep.course.entities.OrderItem;
import com.br.edu.unidep.course.entities.User;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
	
}
