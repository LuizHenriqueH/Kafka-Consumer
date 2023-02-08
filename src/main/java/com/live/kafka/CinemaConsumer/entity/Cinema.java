package com.live.kafka.CinemaConsumer.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.util.UUID;
@Entity
@Table(name="Cinema")
public class Cinema {
    @Id
    private UUID id;

    @Column(name = "title")
    private String movieTitle;
    @Column(name = "genre")
    private String genre;
    @Column(name = "year")
    private String year;
    @Column(name = "director")
    private String director;
    @Column(name = "classification")
    private String classification;
    @Column(name = "imdbPage")
    private String imdbPage;

    public Cinema() {
    }

    public Cinema(UUID id, String movieTitle, String genre, String year, String director, String classification, String imdbPage) {
        this.id = id;
        this.movieTitle = movieTitle;
        this.genre = genre;
        this.year = year;
        this.director = director;
        this.classification = classification;
        this.imdbPage = imdbPage;
    }


    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getMovieTitle() {
        return movieTitle;
    }

    public void setMovieTitle(String movieTitle) {
        this.movieTitle = movieTitle;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getClassification() {
        return classification;
    }

    public void setClassification(String classification) {
        this.classification = classification;
    }

    public String getImdbPage() {
        return imdbPage;
    }

    public void setImdbPage(String imdbPage) {
        this.imdbPage = imdbPage;
    }
}
