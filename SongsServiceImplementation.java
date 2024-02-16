package com.example.demo.services;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Songs;
import com.example.demo.repositries.SongsRepositry;

@Service
public class SongsServiceImplementation implements SongsService{

	@Autowired
	SongsRepositry srepo;

	@Override
	public String addSongs(Songs song) {
		srepo.save(song);
		return "Song is Added";
	}

	@Override
	public boolean songExists(String name) {

		Songs song=srepo.findByName(name);

		if(song == null)
		{
			return false;
		}
		else {
			return true;
		}
	}

	@Override
	public List<Songs>fetchAllSongs() {
		List<Songs>songlist=srepo.findAll();
		return songlist;
	}

}
