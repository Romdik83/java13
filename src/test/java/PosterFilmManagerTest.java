package ru.netology.stats.java13.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PosterFilmManagerTest {

    PosterFilmManager manager = new PosterFilmManager();
    PosterFilm film1 = new PosterFilm(1, "Бладшот", "боевик");
    PosterFilm film2 = new PosterFilm(2, "Вперёд", "мультфильм");
    PosterFilm film3 = new PosterFilm(3, "Отель Белград", "комедия");
    PosterFilm film4 = new PosterFilm(4, "Джентельмены", "боевик");
    PosterFilm film5 = new PosterFilm(5, "Человек-невидимка", "ужасы");
    PosterFilm film6 = new PosterFilm(6, "Тролли. Мировой тур", "мультфильм");
    PosterFilm film7 = new PosterFilm(7, "Номер один", "комедия");

    @BeforeEach
    public void setup() {
        manager.findAll("film1");
        manager.findAll("film2");
        manager.findAll("film3");
        manager.findAll("film4");
        manager.findAll("film5");
        manager.findAll("film6");
        manager.findAll("film7");
    }

    @Test
    public void PosterFilm() {
        PosterFilmManager manager = new PosterFilmManager();
        String[] expected = {};
        String[] actual = manager.getFilms();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findAll() {

        String[] expected = {"film1", "film2", "film3", "film4", "film5", "film6", "film7"};
        String[] actual = manager.getFilms();
        Assertions.assertArrayEquals(expected, actual);
    }


    @Test
    public void findLast() {

        String[] expected = {"film7", "film6", "film5", "film4", "film3"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }
}
