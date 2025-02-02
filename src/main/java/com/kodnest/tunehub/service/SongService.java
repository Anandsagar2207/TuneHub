package com.kodnest.tunehub.service;

import java.util.List;

import com.kodnest.tunehub.entity.Song;


public interface SongService {

	public String addSong(Song song);

	public List<Song> fetchAllSongs();

	public void updateSong(Song s);

	public boolean songExists(String name);

}
