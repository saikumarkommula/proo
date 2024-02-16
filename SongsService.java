package com.example.demo.services;

import java.util.List;

import com.example.demo.entity.Songs;

public interface SongsService {

	public String addSongs(Songs song);
	
	public boolean songExists(String name);
	
	public List<Songs>fetchAllSongs();
}
