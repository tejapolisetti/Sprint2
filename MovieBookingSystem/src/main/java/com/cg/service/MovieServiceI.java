package com.cg.service;

import java.util.List;
import java.util.Set;

import com.cg.entities.Movie;
import com.cg.entities.Screen;
import com.cg.entities.Show;
import com.cg.entities.Theatre;

public interface MovieServiceI {
	public void createTheatre(Theatre theatre);
	public void createMovie(Movie movie);
	public void createShow(Show show);
	public void createScreen(Screen screen);
	public Theatre getTheatreById(int theatreId);
	public Movie findById(Integer id);
	public Theatre update(Theatre theatre);
	public Set<Movie> fetchMovies(Integer theatre_id);
	public Movie searchMovie(String movie_name);
	public Theatre searchTheatre(String theatre_name) ;
	public Movie movieByID(int movie_id);
	public Movie updateMovie(Movie movie);
	public List<Theatre> searchByMovie(String movie_name);
	public List<Movie> searchByCity(String theatre_city);
	public List<Theatre> fetchAllTheatres();
	public List<Movie> fetchAllMovies();
}
