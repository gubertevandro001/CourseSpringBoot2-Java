package com.br.edu.unidep.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.br.edu.unidep.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
	
}
