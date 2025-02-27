package com.example.marvApiJava.Models;

import jakarta.persistence.*;

@Entity
@Table(name = "movies")
public class Movies {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int movie_id;
    String title;
    int release_year;

    public Movies() {} ;

    public Movies(int movie_id, String title, int release_year) {
        this.movie_id = movie_id;
        this.title = title;

            this.release_year = release_year;
    }

    public int getMovie_id() {
        return movie_id;
    }

    public void setMovie_id(int movie_id) {
        this.movie_id = movie_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getRelease_year() {
        return release_year;
    }

    public void setRelease_year(int release_year) {
        this.release_year = release_year;
    }

}//end of Movies
