package ru.netology.stats.java13.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PosterFilmManagerTest {

    PosterFilmManager manager = new PosterFilmManager();
    ru.netology.stats.java13.service.PosterFilm film1 = new ru.netology.stats.java13.service.PosterFilm(1, "Бладшот", "боевик");
    ru.netology.stats.java13.service.PosterFilm film2 = new ru.netology.stats.java13.service.PosterFilm(2, "Вперёд", "мультфильм");
    ru.netology.stats.java13.service.PosterFilm film3 = new ru.netology.stats.java13.service.PosterFilm(3, "Отель Белград", "комедия");
    ru.netology.stats.java13.service.PosterFilm film4 = new ru.netology.stats.java13.service.PosterFilm(4, "Джентельмены", "боевик");
    ru.netology.stats.java13.service.PosterFilm film5 = new ru.netology.stats.java13.service.PosterFilm(5, "Человек-невидимка", "ужасы");
    ru.netology.stats.java13.service.PosterFilm film6 = new ru.netology.stats.java13.service.PosterFilm(6, "Тролли. Мировой тур", "мультфильм");
    ru.netology.stats.java13.service.PosterFilm film7 = new ru.netology.stats.java13.service.PosterFilm(7, "Номер один", "комедия");

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
    public void findAll() {

        String[] expected = {"film1", "film2", "film3", "film4", "film5", "film6", "film7"};
        String[] actual = manager.getFilms();
        Assertions.assertArrayEquals(expected, actual);
    }



    @Test
    public void findLast() {

        String[] expected = {"film7", "film6", "film5"};
        String[] actual = manager.findLastLimitLimit();
        Assertions.assertArrayEquals(expected, actual);
    }
}
