package com.example.demo.repositries;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Users;

public interface UsersRepositry extends JpaRepository<Users,Integer> {

	public Users findByEmail(String email);
}
