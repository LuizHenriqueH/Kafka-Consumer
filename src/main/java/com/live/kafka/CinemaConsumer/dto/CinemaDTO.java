package com.live.kafka.CinemaConsumer.dto;

import com.live.kafka.CinemaConsumer.entity.Cinema;
import lombok.Builder;
import lombok.Data;

import java.util.UUID;

@Data
@Builder
public class CinemaDTO {

    private UUID id;
    private String movieTitle;
    private String genre;
    private String year;
    private String director;
    private String classification;
    private String imdbPage;

    public CinemaDTO() {
    }

    public CinemaDTO(UUID id, String movieTitle, String genre, String year, String director, String classification, String imdbPage) {
        this.id = id;
        this.movieTitle = movieTitle;
        this.genre = genre;
        this.year = year;
        this.director = director;
        this.classification = classification;
        this.imdbPage = imdbPage;
    }

    public Cinema toEntity(){
        return new Cinema(this.id, this.movieTitle, this.genre, this.year, this.director, this.classification, this.imdbPage);
    }
}
