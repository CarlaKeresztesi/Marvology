package com.example.marvApiJava.Models;

public class Heroes_In_Movies {

    Long hero_id;
    Long movie_id;

    public Heroes_In_Movies(Long hero_id, Long movie_id) {
        this.hero_id = hero_id;
        this.movie_id = movie_id;
    }

    public Long getHero_id() {
        return hero_id;
    }

    public void setHero_id(Long hero_id) {
        this.hero_id = hero_id;
    }

    public Long getMovie_id() {
        return movie_id;
    }

    public void setMovie_id(Long movie_id) {
        this.movie_id = movie_id;
    }

}//end of Heroes_In_Movies
