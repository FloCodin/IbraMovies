package org.example.ibramovie.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Entitätsklasse, die einen Film darstellt.
 */
@Entity
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String overview;
    private String posterPath;
    private String releaseDate;
    private Integer runtime;
    private Double voteAverage;

    // Standard-Konstruktor
    public Movie() {}

    /**
     * Konstruktor für Movie mit Parametern.
     *
     * @param title       der Titel des Films
     * @param overview    die Beschreibung des Films
     * @param posterPath  der Pfad zum Poster des Films
     * @param releaseDate das Erscheinungsdatum des Films
     * @param runtime     die Laufzeit des Films in Minuten
     * @param voteAverage die Durchschnittsbewertung des Films
     */
    public Movie(String title, String overview, String posterPath, String releaseDate, Integer runtime, Double voteAverage) {
        this.title = title;
        this.overview = overview;
        this.posterPath = posterPath;
        this.releaseDate = releaseDate;
        this.runtime = runtime;
        this.voteAverage = voteAverage;
    }

    // Getter und Setter
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getOverview() {
        return overview;
    }

    public void setOverview(String overview) {
        this.overview = overview;
    }

    public String getPosterPath() {
        return posterPath;
    }

    public void setPosterPath(String posterPath) {
        this.posterPath = posterPath;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public Integer getRuntime() {
        return runtime;
    }

    public void setRuntime(Integer runtime) {
        this.runtime = runtime;
    }

    public Double getVoteAverage() {
        return voteAverage;
    }

    public void setVoteAverage(Double voteAverage) {
        this.voteAverage = voteAverage;
    }
}
