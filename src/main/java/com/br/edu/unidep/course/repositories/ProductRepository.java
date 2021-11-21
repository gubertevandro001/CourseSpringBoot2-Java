package com.br.edu.unidep.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.br.edu.unidep.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Integer>{

}
