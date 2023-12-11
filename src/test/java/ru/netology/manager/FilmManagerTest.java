package ru.netology.manager;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import ru.netology.domain.film.Film;

public class FilmManagerTest {
    FilmManager manager = new FilmManager();

    Film film1 = new Film(121, "Forward");
    Film film2 = new Film(122, "Hotel Belgrad");
    Film film3 = new Film(123, "Gentlemen");
    Film film4 = new Film(124, "Invisible");
    Film film5 = new Film(125, "Trolls");
    Film film6 = new Film(126, "Number One");
    Film film7 = new Film(127, "Next film");
    Film film8 = new Film(128, "One more film");

    @Test
    public void shouldAddFilms() {

        manager.addFilm(film1);
        manager.addFilm(film2);
        manager.addFilm(film3);
        manager.addFilm(film4);
        manager.addFilm(film5);
        manager.addFilm(film6);
        manager.addFilm(film7);
        manager.addFilm(film8);

        Film[] expected = {film1, film2, film3, film4, film5, film6, film7, film8};
        Film[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void shouldNotAddFilms() {

        Film[] expected = {};
        Film[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);

    }

}
