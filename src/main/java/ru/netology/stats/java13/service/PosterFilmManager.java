package ru.netology.stats.java13.service;

public class PosterFilmManager {
    private String[] films = new String[0];// менеджер не содержит фильмы после создания
    private int countFilm; // значение количества фильмов по умолчанию

    public PosterFilmManager(int countFilm) { //конструктор с изменяемым количеством фильмов
        this.countFilm = countFilm;
    }

    public PosterFilmManager() { //конструктор со значением количества фильмов по умолчанию
        this.countFilm = 5;
    }


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

    public String[] findLast() {
        String[] tmp = new String[3];
        for (int i = 0; i < tmp.length; i++) {
            tmp[i] = films[films.length - 1 - i];
        } return tmp;
    }

}
