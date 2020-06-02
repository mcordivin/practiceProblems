package com.mc.interviewPrep;

public class Movie {
    int id;
    String movieTitle;
    int rating;

    public Movie(){}

    public Movie(int id, String movieTitle, int rating) {
        this.id = id;
        this.movieTitle = movieTitle;
        this.rating = rating;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMovieTitle() {
        return movieTitle;
    }

    public void setMovieTitle(String movieTitle) {
        this.movieTitle = movieTitle;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
}
