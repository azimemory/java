package com.kh.b_tcp.model.vo;

import java.io.Serializable;

public class Music implements Serializable{
	
	private static final long serialVersionUID = 5553725525015215267L;
	private String artist;
	private String title;
	
	public Music(String artist, String title) {
		super();
		this.artist = artist;
		this.title = title;
	}
	
	public String getArtist() {
		return artist;
	}
	
	public void setArtist(String artist) {
		this.artist = artist;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	@Override
	public String toString() {
		return "Music [artist=" + artist + ", title=" + title + "]";
	}
	
	
	

}
