package ru.netology.stats.java13.service;

public class PosterFilm {
    private int idFilm;
    private String theNameOfTheMovie;
    private String movieGenre;

    public PosterFilm(int idFilm, String theNameOfTheMovie, String movieGenre) {
        this.idFilm = idFilm;
        this.theNameOfTheMovie = theNameOfTheMovie;
    }

    public int getIdFilm() {
        return idFilm;
    }

    public void setIdFilm(int idFilm) {
        this.idFilm = idFilm;
    }

    public String getTheNameOfTheMovie() {
        return theNameOfTheMovie;
    }

    public void setTheNameOfTheMovie(String theNameOfTheMovie) {
        this.theNameOfTheMovie = theNameOfTheMovie;
    }

    public String getMovieGenre() {
        return movieGenre;
    }

    public void setMovieGenre(String movieGenre) {
        this.movieGenre = movieGenre;
    }
}

