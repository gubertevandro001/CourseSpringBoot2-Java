package com.br.edu.unidep.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.br.edu.unidep.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
}
