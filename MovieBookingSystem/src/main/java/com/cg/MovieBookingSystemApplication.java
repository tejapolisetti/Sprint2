package com.cg;

import java.sql.Time;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.cg.dao.MovieDaoI;
import com.cg.entities.Movie;
import com.cg.entities.Screen;
import com.cg.entities.Show;
import com.cg.entities.Theatre;
import com.cg.service.MovieServiceI;
import com.sun.xml.bind.v2.runtime.reflect.ListIterator;

import javassist.bytecode.Descriptor.Iterator;

@SpringBootApplication
public class MovieBookingSystemApplication implements CommandLineRunner {
	@Autowired
	MovieServiceI service; 
	

	public static void main(String[] args) {
		SpringApplication.run(MovieBookingSystemApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
//		Theatre theatre=new Theatre();
//		theatre.setTheatreCity("phagwara");
//		theatre.setManagerName("Polisetti Teja");
//		theatre.setManagerContact("915989952");
//		theatre.setTheatreName("QUORO MALL");
//		service.createTheatre(theatre);
//		System.out.println("theatre created");
//		
//		Movie m=new Movie();
//		m.setMovieName("poliri");
//		m.setHero("Mahesh Babu");
//		m.setDirector("Puri Jagannadh");
//		m.setGenre("action");
//		m.setReleaseYear(2020);
//		m.setHeroine("Ileana");
//		m.setLanguage("Telugu");
//		m.setRuntime(150);
//		service.createMovie(m);
//		System.out.println("movie created");
//		
		
		
//		Movie m1=service.findById(20);
//		Movie movie2=service.findById(22);
////		Movie movie3=dao.findById(5);
////		
//	Theatre th=service.getTheatreById(19);
//		Set<Movie> movies=th.getListOfMovies();
//		movies.add(m1);
//		movies.add(movie2);
//		th.setListOfMovies(movies);
//		service.update(th);
//		System.out.println("Theatre Updated");
	

		
//		System.out.println(service.searchMovie("eega"));
//		System.out.println(service.searchByMovie("eega"));
	System.out.println(service.searchByCity("phagwara"));
//		
//		System.out.println(service.fetchAllMovies());
//		System.out.println("------------------------------------------------------------------");
//		System.out.println(service.fetchAllTheatres());
//		System.out.println(service.getTheatreById(1));
//		System.out.println(service.findById(2));
//		
//		Movie m1=service.findById(23);
//		Movie m2=service.findById(24);
//	Theatre th=service.getTheatreById(21);	
//	
//		Set<Movie> movies=th.getListOfMovies();
//		movies.add(m1);
//		movies.add(m2);
//		th.setListOfMovies(movies);
//		service.update(th);
//		System.out.println("updated theatre");
	}

}
