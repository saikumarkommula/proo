package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import com.example.demo.entity.Songs;
import com.example.demo.services.SongsService;

@Controller
public class SongsController {
	
	@Autowired
	SongsService songserv;
	
	@PostMapping("/addsongs")
	public String addSongs(@ModelAttribute Songs song) {
		
		
		String name=song.getName();
		boolean status=songserv.songExists(song.getName());
		
		// boolean status=songserv.songExists(song.getName());
		
		if(status == false)
		{
			songserv.addSongs(song);
			return "songsucess";
			
		}
		
		else
		{
			return "songfail";
		}	
	}
	@GetMapping("map-viewsongs")
	public String viewSongs()
	{
		
		List<Songs>songslist=songserv.fetchAllSongs();
		System.out.println(songslist);
		return "displaysongs";
	}

}
