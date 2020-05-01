package com.cg.controller;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.cg.dao.MovieDaoI;
import com.cg.entities.Movie;
import com.cg.entities.Theatre;
import com.cg.service.MovieServiceI;



@CrossOrigin(origins="http://localhost:4200")
@RestController
public class MovieController {
	@Autowired
	MovieServiceI service;
	
	
	@GetMapping(value="/search/{name}")
	@ResponseBody
    public Movie searchMovie(@PathVariable String name)
    {
    	return service.searchMovie(name);
    }
	@GetMapping(value="/searchCity/{city}")
	@ResponseBody
    public List<Movie> searchByCity(@PathVariable String city)
    {
    	return service.searchByCity(city);
    }
	
	}