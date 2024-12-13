package org.example.ibramovie.controller;

import org.example.ibramovie.Service.WatchlistService;
import org.example.ibramovie.dto.WatchlistRequest;
import org.example.ibramovie.model.Movie;
import org.example.ibramovie.Service.MovieService;
import org.example.ibramovie.model.Watchlist;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

/**
 * Controller, der REST-Endpunkte für Filme und Watchlist-Funktionen bereitstellt.
 */
@RestController
@RequestMapping("/api/movies")
public class MovieController {

    @Autowired
    private MovieService movieService;

    @Autowired
    private WatchlistService watchlistService;

    /**
     * Fügt einen neuen Film hinzu.
     *
     * @param movie der hinzuzufügende Film
     * @return der hinzugefügte Film
     */
    @PostMapping
    public ResponseEntity<Movie> addMovie(@RequestBody Movie movie) {
        Movie createdMovie = movieService.addMovie(movie);
        return ResponseEntity.ok(createdMovie);
    }

    /**
     * Gibt eine Liste aller Filme zurück.
     *
     * @return Liste aller Filme
     */
    @GetMapping
    public ResponseEntity<List<Movie>> getAllMovies() {
        List<Movie> movies = movieService.getAllMovies();
        return ResponseEntity.ok(movies);
    }

    /**
     * Gibt einen Film anhand der ID zurück.
     *
     * @param id die ID des Films
     * @return der Film, falls vorhanden
     */
    @GetMapping("/{id}")
    public ResponseEntity<Movie> getMovieById(@PathVariable Long id) {
        Optional<Movie> movie = movieService.getMovieById(id);
        return movie.map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    /**
     * Aktualisiert einen bestehenden Film.
     *
     * @param id    die ID des zu aktualisierenden Films
     * @param movie die neuen Filmdaten
     * @return der aktualisierte Film
     */
    @PutMapping("/{id}")
    public ResponseEntity<Movie> updateMovie(@PathVariable Long id, @RequestBody Movie movie) {
        Movie updatedMovie = movieService.updateMovie(id, movie);
        return updatedMovie != null ? ResponseEntity.ok(updatedMovie) : ResponseEntity.notFound().build();
    }

    /**
     * Löscht einen Film anhand der ID.
     *
     * @param id die ID des zu löschenden Films
     * @return leere Antwort
     */
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteMovie(@PathVariable Long id) {
        movieService.deleteMovie(id);
        return ResponseEntity.noContent().build();
    }

    /**
     * Fügt einen Film zur Watchlist hinzu.
     *
     * @param watchlistRequest enthält die ID des hinzuzufügenden Films
     * @return das erstellte Watchlist-Objekt
     */
    @PostMapping("/watchlist")
    public ResponseEntity<Watchlist> addToWatchlist(@RequestBody WatchlistRequest watchlistRequest) {
        Watchlist createdItem = watchlistService.addToWatchlist(watchlistRequest.getMovieId());
        return ResponseEntity.ok(createdItem);
    }

    /**
     * Gibt alle Filme in der Watchlist zurück.
     *
     * @return Liste von Filmen in der Watchlist
     */
    @GetMapping("/watchlist")
    public ResponseEntity<List<Movie>> getWatchlist() {
        List<Movie> watchlistMovies = watchlistService.getWatchlistMovies();
        return ResponseEntity.ok(watchlistMovies);
    }

    /**
     * Entfernt einen Film aus der Watchlist.
     *
     * @param movieId die ID des zu entfernenden Films
     * @return leere Antwort
     */
    @DeleteMapping("/watchlist/{movieId}")
    public ResponseEntity<Void> removeFromWatchlist(@PathVariable Long movieId) {
        watchlistService.removeFromWatchlist(movieId);
        return ResponseEntity.noContent().build();
    }
}
