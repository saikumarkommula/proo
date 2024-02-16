package com.example.demo.repositries;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Songs;

public interface SongsRepositry extends JpaRepository<Songs, Integer> {

	public Songs findByName(String name);
}
