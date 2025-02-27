package com.example.marvApiJava.Controllers;

import com.example.marvApiJava.Models.Heroes;
import com.example.marvApiJava.Models.Movies;
import com.example.marvApiJava.Repository.MarvelRepoMovies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/movies")
public class MovieController {
    private MarvelRepoMovies marvelRepoMovies;

    @Autowired
    public MovieController(MarvelRepoMovies marvelRepoMovies) {
        this.marvelRepoMovies = marvelRepoMovies;
    }
    @GetMapping("/")
    public List<Movies> getAllMovies() {
        return marvelRepoMovies.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Movies> getMovieById(@PathVariable("id") int id){
        return marvelRepoMovies.findById(id);
    }
}
