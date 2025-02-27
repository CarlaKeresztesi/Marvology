package com.example.marvApiJava.Repository;

import com.example.marvApiJava.Models.Movies;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MarvelRepoMovies extends JpaRepository<Movies, Integer> {

}
