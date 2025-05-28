package ru.netology.stats.java13.service;

public class PosterFilmManager {
    private int countFilm = 7;
    private String[] films = new String[0];


    public void findAll(String film) {
        String[] tmp = new String[films.length + 1];
        for (int i = 0; i < films.length; i++) {
            tmp[i] = films[i];
        }
        tmp[tmp.length - 1] = film;
        films = tmp;
    }
    public String[] getFilms() {
        return films;
    }

    public String[] findLastLimitLimit() {
        String[] tmp = new String[3];
        for (int i = 0; i < tmp.length; i++) {
            tmp[i] = films[films.length - 1 - i];
        } return tmp;
    }

}
