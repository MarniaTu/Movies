package ru.netology.manager;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import ru.netology.domain.film.Film;

public class FilmManagerTwoTest {

    FilmManager manager = new FilmManager();
    Film film1 = new Film(121, "Forward");
    Film film2 = new Film(122, "Hotel Belgrad");
    Film film3 = new Film(123, "Gentlemen");
    Film film4 = new Film(124, "Invisible");
    Film film5 = new Film(125, "Trolls");
    Film film6 = new Film(126, "Number One");
    Film film7 = new Film(127, "Next film");
    Film film8 = new Film(128, "One more film");

    @BeforeEach
    public void setup() {
        manager.addFilm(film1);
        manager.addFilm(film2);
        manager.addFilm(film3);
        manager.addFilm(film4);
        manager.addFilm(film5);
        manager.addFilm(film6);
        manager.addFilm(film7);
        manager.addFilm(film8);
    }

    @Test
    public void shouldFindLastFiveFilms() {

        manager.findLast();

        Film[] expected = {film8, film7, film6, film5, film4};
        Film[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);


    }

    @Test
    public void shouldNotFindFilms() {

        manager.setLimit(0);

        manager.findLast();

        Film[] expected = {};
        Film[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void shouldFindOneLastFilm() {

        manager.setLimit(1);

        manager.findLast();

        Film[] expected = {film8};
        Film[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);


    }

    @Test
    public void shouldFindAllFilmsReversed() {

        manager.setLimit(8);

        manager.findLast();

        Film[] expected = {film8, film7, film6, film5, film4, film3, film2, film1};
        Film[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);


    }

    @Test
    public void shouldFindSevenLastFilms() {

        manager.setLimit(7);

        manager.findLast();

        Film[] expected = {film8, film7, film6, film5, film4, film3, film2};
        Film[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);


    }

    @Test
    public void shouldNotFindNineLastFilms() {

        manager.setLimit(9);

        manager.findLast();

        Film[] expected = {film8, film7, film6, film5, film4, film3, film2, film1};
        Film[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);

    }
}
