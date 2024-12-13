package org.example.ibramovie.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Entitätsklasse, die einen Eintrag in der Watchlist darstellt.
 */
@Entity
public class Watchlist {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long movieId;

    // Standard-Konstruktor
    public Watchlist() {}

    /**
     * Konstruktor für Watchlist mit Film-ID.
     *
     * @param movieId die ID des Films, der zur Watchlist hinzugefügt wurde
     */
    public Watchlist(Long movieId) {
        this.movieId = movieId;
    }

    // Getter und Setter
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getMovieId() {
        return movieId;
    }

    public void setMovieId(Long movieId) {
        this.movieId = movieId;
    }
}
