package com.cg.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.cg.entities.Movie;
import com.cg.entities.Theatre;
@Repository
@Transactional
public class TheatreDaoimpl implements TheatreDaoI {
	@PersistenceContext
	EntityManager manager;
	
	
	@Override
	public void createTheatre(Theatre theatre) {
		manager.persist(theatre);
		
	}
	
	@Override
	public Theatre getTheatreById(int theatreId) {
		Theatre theatre=manager.find(Theatre.class,theatreId);
		// TODO Auto-generated method stub
		return theatre;
	}
	
	@Override
	public Theatre update(Theatre theatre) {
		// TODO Auto-generated method stub
		manager.merge(theatre);
		return theatre;
	}
	@Override
	public Theatre searchTheatre(String theatre_name) {
		 String query1 = "SELECT t from Theatre t where t.theatreName=:name";
		 TypedQuery<Theatre> query = manager.createQuery(query1, Theatre.class);
		 query.setParameter("name",theatre_name);
		return query.getSingleResult();
	}

	@Override
	public List<Movie> searchByCity(String theatre_city) {
		Query query=manager.createQuery("select t.listOfMovies from Theatre t where t.theatreCity=:name");
		 query.setParameter("name",theatre_city);
		return query.getResultList();
	}

	@Override
	public List<Theatre> fetchAllTheatres() {
		Query query=manager.createQuery("select t from Theatre t");
		return query.getResultList();
	}


}
