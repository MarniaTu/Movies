package ru.netology.domain.film;

public class Film {

    private int id;
    private String filmName;

    public Film(int id, String filmName) {
        this.id = id;
        this.filmName = filmName;
    }

    public int getId() {
        return id;
    }

    public String getFilmName() {
        return filmName;
    }
}
