package com.cg.dao;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cg.entities.Movie;
import com.cg.entities.Screen;
import com.cg.entities.Show;
import com.cg.entities.Theatre;
import com.cg.exceptions.MovieException;

@Repository
@Transactional
public class MovieDaoimpl implements MovieDaoI {
	@PersistenceContext
	EntityManager manager;


	

	@Override
	public void createMovie(Movie movie) {
		manager.persist(movie);
		
		
	}

	@Override
	public void createShow(Show show) {
		manager.persist(show);
		
		
	}

	@Override
	public void createScreen(Screen screen) {
		manager.persist(screen);
		// TODO Auto-generated method stub
		
	}

	

//	@Override
//	public List<Theatre> getAll(Integer theatre_id) {
//		Query q1=manager.createQuery("select t.managerName from Theatre t where t.theatreId=:theatre_id");
//		q1.setParameter("theatre_id", theatre_id);
//		// TODO Auto-generated method stub
//		return q1.getResultList();
//	}
	@Override
	public Movie findById(Integer id) {
		// TODO Auto-generated method stub
		return manager.find(Movie.class,id);
		
	}
//	@Override
//	public Theatre updateTheatre(Integer theatre_id, Theatre theatre) {
//		// TODO Auto-generated method stub
//		Theatre t=manager.find(Theatre.class, theatre_id);
//		manager.merge(theatre);
//		return theatre;
//	}
	
	
//	@Override
//	public Movie getbyName(String name) {
//		 String query1 = "SELECT m from Movie m where m.movieName=:name";
//		 TypedQuery<Movie> query = manager.createQuery(query1, Movie.class);
//		 query.setParameter("name",name);
//		// TODO Auto-generated method stub
//		return query.getSingleResult();
//	}

	@Override
	public Set<Movie> fetchMovies(Integer theatre_id) {
		
		// TODO Auto-generated method stub
		Theatre t=manager.find(Theatre.class, theatre_id);
		return t.getListOfMovies();
	}

	@Override
	public Movie searchMovie(String movie_name) {
		Set<Movie> movies=fetchMovies(17);
		for (Iterator iterator = movies.iterator(); iterator.hasNext();) {
			Movie movie = (Movie) iterator.next();
//			System.out.println(movie.getMovieName()+"   "+movie_name);
			if(movie.getMovieName().equals(movie_name))
			{
				
				return movie;
				
			}
			
		}
		// TODO Auto-generated method stub
		return null;
	}

	

	@Override
	public Movie movieByID(int movie_id) {
		// TODO Auto-generated method stub
		Movie movie= manager.find(Movie.class, movie_id);
		return movie;
	}

	@Override
	public Movie updateMovie(Movie movie) {
		manager.merge(movie);
		// TODO Auto-generated method stub
		return movie;
	}

	@Override
	public List<Theatre> searchByMovie(String movie_name) {
		Query query=manager.createQuery("select m.listOfTheatres from Movie m where m.movieName=:name");
		 query.setParameter("name",movie_name);
		 if(query==null)
		 {
			 throw new MovieException("movie_name is not present");
		 }
		return query.getResultList();
	}

	@Override
	public List<Movie> fetchAllMovies() {
		Query query=manager.createQuery("select m from Movie m");
		return query.getResultList();
	}
}
