package com.example.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.curso.entities.User;

//não precisa do @Repository pq já está herdando do JpaRepository
public interface UserRepository extends JpaRepository<User, Long>{
	
	
	
}
