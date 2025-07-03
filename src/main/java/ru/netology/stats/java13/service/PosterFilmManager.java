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

    public String[] findAll() {

        return films;
    }


    public String[] findLast() {
        int resultLength;
        if (films.length < countFilm) {
            resultLength = films.length;
        } else {
            resultLength = countFilm;
        }
        String[] tmp = new String[resultLength];
        for (int i = 0; i < tmp.length; i++) {
            tmp[i] = films[films.length - 1 - i];
        }
        return tmp;
    }

    public String[] getFindAll() {

        String[] result = new String[films.length];
        for (int i = 0; i < result.length; i++) {
            int index = films.length - i - 1;
            result[i] = films[index];
        }
        return result;
    }

    public void add(String film) {
        int resultLength = films.length + 1;
        String[] tmp = new String[resultLength];

        System.arraycopy(films, 0, tmp, 0, films.length);

        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = film;
        films = tmp;
    }

    public String[] getFindLast() {
        int resultLength = countFilm;
        if (resultLength > films.length) {
            resultLength = films.length;
        }

        String[] result = new String[resultLength];

        for (int i = 0; i < resultLength; i++) {
            int index = films.length - i - 1;
            result[i] = films[index];
        }
        return result;
    }
}
