package org.example.ibramovie.Service;

import org.example.ibramovie.model.Movie;
import org.example.ibramovie.model.Watchlist;
import org.example.ibramovie.repository.MovieRepository;
import org.example.ibramovie.repository.WatchlistRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class WatchlistService {

    private final WatchlistRepository watchlistRepository;
    private final MovieRepository movieRepository;

    @Autowired
    public WatchlistService(WatchlistRepository watchlistRepository, MovieRepository movieRepository) {
        this.watchlistRepository = watchlistRepository;
        this.movieRepository = movieRepository;
    }

    public Watchlist addToWatchlist(Long movieId) {
        // Prüfen, ob der Film in der Datenbank existiert
        Movie movie = movieRepository.findById(movieId)
                .orElseThrow(() -> new RuntimeException("Film nicht gefunden"));

        // Prüfen, ob der Film bereits in der Watchlist ist
        if (watchlistRepository.findByMovieId(movieId).isPresent()) {
            throw new RuntimeException("Film ist bereits in der Watchlist");
        }

        // Watchlist-Objekt erstellen und speichern
        Watchlist watchlistItem = new Watchlist(movieId);
        return watchlistRepository.save(watchlistItem);
    }

    public void removeFromWatchlist(Long movieId) {
        // Prüfen, ob der Film in der Watchlist existiert, bevor er entfernt wird
        Watchlist watchlistItem = watchlistRepository.findByMovieId(movieId)
                .orElseThrow(() -> new RuntimeException("Film ist nicht in der Watchlist"));

        watchlistRepository.delete(watchlistItem);
    }

    public List<Movie> getWatchlistMovies() {
        List<Watchlist> watchlistItems = watchlistRepository.findAll();

        // Erzeugt eine Liste von Movie-Objekten basierend auf der Watchlist
        return watchlistItems.stream()
                .map(item -> movieRepository.findById(item.getMovieId()).orElse(null))
                .filter(movie -> movie != null)
                .collect(Collectors.toList());
    }
}
