package com.cg.dao;

import java.util.List;
import java.util.Set;

import com.cg.entities.Movie;
import com.cg.entities.Screen;
import com.cg.entities.Show;
import com.cg.entities.Theatre;

public interface MovieDaoI {
	public void createMovie(Movie movie);
	public void createShow(Show show);
	public void createScreen(Screen screen);
	
	//public List<Theatre> getAll(Integer theatre_id);
	public Movie findById(Integer id);
	//public Theatre updateTheatre(Integer id, Theatre theatre);
//	public Movie getbyName(String movie_name);
	public Set<Movie> fetchMovies(Integer theatre_id);
	public Movie searchMovie(String movie_name);
	public Movie movieByID(int movie_id);
	public Movie updateMovie(Movie movie);
	public List<Theatre> searchByMovie(String movie_name);
	public List<Movie> fetchAllMovies(); 

}
