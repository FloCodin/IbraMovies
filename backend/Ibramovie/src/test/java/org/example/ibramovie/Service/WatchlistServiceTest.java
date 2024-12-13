package org.example.ibramovie.Service;

import org.example.ibramovie.model.Movie;
import org.example.ibramovie.model.Watchlist;
import org.example.ibramovie.repository.MovieRepository;
import org.example.ibramovie.repository.WatchlistRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class WatchlistServiceTest {

    @Mock
    private WatchlistRepository watchlistRepository;

    @Mock
    private MovieRepository movieRepository;

    @InjectMocks
    private WatchlistService watchlistService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testAddToWatchlist() {
        Movie movie = new Movie("BeispielFilm", "Beschreibung", "Pfad", "2024-01-01", 90, 8.0);
        when(movieRepository.findById(1L)).thenReturn(Optional.of(movie));
        Watchlist watchlistItem = new Watchlist(1L);
        when(watchlistRepository.save(any(Watchlist.class))).thenReturn(watchlistItem);

        Watchlist result = watchlistService.addToWatchlist(1L);
        assertNotNull(result);
        assertEquals(1L, result.getMovieId());
    }

    @Test
    void testRemoveFromWatchlist() {
        Watchlist watchlistItem = new Watchlist(1L);
        when(watchlistRepository.findByMovieId(1L)).thenReturn(Optional.of(watchlistItem));
        doNothing().when(watchlistRepository).delete(watchlistItem);

        watchlistService.removeFromWatchlist(1L);
        verify(watchlistRepository, times(1)).delete(watchlistItem);
    }

    @Test
    void testGetWatchlistMovies() {
        Watchlist watchlistItem = new Watchlist(1L);
        when(watchlistRepository.findAll()).thenReturn(Arrays.asList(watchlistItem));

        Movie movie = new Movie("BeispielFilm", "Beschreibung", "Pfad", "2024-01-01", 90, 8.0);
        when(movieRepository.findById(1L)).thenReturn(Optional.of(movie));

        List<Movie> watchlistMovies = watchlistService.getWatchlistMovies();
        assertEquals(1, watchlistMovies.size());
        assertEquals("BeispielFilm", watchlistMovies.get(0).getTitle());
    }

    @Test
    void testAddToWatchlist_MovieNotFound() {
        when(movieRepository.findById(2L)).thenReturn(Optional.empty());

        Exception exception = assertThrows(RuntimeException.class, () -> {
            watchlistService.addToWatchlist(2L);
        });

        assertEquals("Film nicht gefunden", exception.getMessage());
    }

    @Test
    void testAddToWatchlist_AlreadyExists() {
        when(movieRepository.findById(1L)).thenReturn(Optional.of(new Movie()));
        when(watchlistRepository.findByMovieId(1L)).thenReturn(Optional.of(new Watchlist(1L)));

        Exception exception = assertThrows(RuntimeException.class, () -> {
            watchlistService.addToWatchlist(1L);
        });

        assertEquals("Film ist bereits in der Watchlist", exception.getMessage());
    }
}
