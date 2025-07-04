package ru.netology.stats.java13.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class PosterFilmManagerTest {
    PosterFilmManager manager = new PosterFilmManager(5);

    PosterFilm film1 = new PosterFilm(1, "Бладшот", "боевик");
    PosterFilm film2 = new PosterFilm(2, "Вперёд", "мультфильм");
    PosterFilm film3 = new PosterFilm(3, "Отель Белград", "комедия");
    PosterFilm film4 = new PosterFilm(4, "Джентельмены", "боевик");
    PosterFilm film5 = new PosterFilm(5, "Человек-невидимка", "ужасы");
    PosterFilm film6 = new PosterFilm(6, "Тролли. Мировой тур", "мультфильм");
    PosterFilm film7 = new PosterFilm(7, "Номер один", "комедия");

    @BeforeEach
    public void setup() {
        manager.add("film1");
        manager.add("film2");
        manager.add("film3");
        manager.add("film4");
        manager.add("film5");
        manager.add("film6");
        manager.add("film7");
    }

    @Test
    public void shouldGetEmpty() {
        PosterFilmManager manager = new PosterFilmManager(7);
        String[] actual = manager.findAll();
        String[] expected = new String[]{};

        assertArrayEquals(expected, actual);
    }

    @Test
    public void PosterFilm() {
        PosterFilmManager manager = new PosterFilmManager();
        String[] expected = {};
        String[] actual = manager.findAll();
        assertArrayEquals(expected, actual);
    }

    @Test
    public void findAll() {

        String[] expected = {"film1", "film2", "film3", "film4", "film5", "film6", "film7"};
        String[] actual = manager.findAll();
        assertArrayEquals(expected, actual);
    }


    @Test
    public void findLast() {
        String[] expected = {"film7", "film6", "film5", "film4", "film3"};
        String[] actual = manager.findLast();
        assertArrayEquals(expected, actual);
    }

    @Test
    public void PosterFilm1() {
        PosterFilmManager manager = new PosterFilmManager(4);
        String[] expected = {};
        String[] actual = manager.findAll();
        assertArrayEquals(expected, actual);
    }

    @Test
    public void findLast2() {
        PosterFilmManager manager = new PosterFilmManager(3);
        manager.add("film1");
        manager.add("film2");
        manager.add("film3");
        manager.add("film4");
        manager.add("film5");
        manager.add("film6");
        manager.add("film7");

        String[] expected = {"film7", "film6", "film5"};
        String[] actual = manager.findLast();
        assertArrayEquals(expected, actual);

    }

    @Test
    public void findLast3() {
        PosterFilmManager manager = new PosterFilmManager(4);
        manager.add("film1");
        manager.add("film2");
        manager.add("film3");
        manager.add("film4");
        manager.add("film5");
        manager.add("film6");
        manager.add("film7");

        String[] expected = {"film7", "film6", "film5", "film4"};
        String[] actual = manager.findLast();
        assertArrayEquals(expected, actual);
    }


    @Test
    public void shouldNoFilms() {
        PosterFilmManager manager = new PosterFilmManager(7);
        String[] actual = manager.findLast();
        String[] expected = new String[]{};
        assertArrayEquals(expected, actual);
    }
}
