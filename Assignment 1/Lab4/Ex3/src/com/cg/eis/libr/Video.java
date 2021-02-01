package com.cg.eis.libr;

public class Video extends MediaItem {
	private String director;
	private String genre;
	private double yearReleased;
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public double getYearReleased() {
		return yearReleased;
	}
	public void setYearReleased(double yearReleased) {
		this.yearReleased = yearReleased;
	}

}
