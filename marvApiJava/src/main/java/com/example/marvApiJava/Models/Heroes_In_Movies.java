package com.example.marvApiJava.Models;

import jakarta.persistence.*;

@Entity
@Table(name = "heroes_in_movies")
public class Heroes_In_Movies {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int hero_id;
    int movie_id;

    public Heroes_In_Movies(int hero_id, int movie_id) {
        this.hero_id = hero_id;
        this.movie_id = movie_id;
    }

    public int getHero_id() {
        return hero_id;
    }

    public void setHero_id(int hero_id) {
        this.hero_id = hero_id;
    }

    public int getMovie_id() {
        return movie_id;
    }

    public void setMovie_id(int movie_id) {
        this.movie_id = movie_id;
    }

}//end of Heroes_In_Movies
