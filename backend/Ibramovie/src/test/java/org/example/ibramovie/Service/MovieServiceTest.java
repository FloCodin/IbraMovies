package org.example.ibramovie.Service;

import org.example.ibramovie.model.Movie;
import org.example.ibramovie.repository.MovieRepository;
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

class MovieServiceTest {

    @Mock
    private MovieRepository movieRepository;

    @InjectMocks
    private MovieService movieService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testAddMovie() {
        Movie movie = new Movie("Beispieltitel", "Beschreibung", "PosterPfad", "2024-11-09", 120, 8.5);
        when(movieRepository.save(movie)).thenReturn(movie);

        Movie result = movieService.addMovie(movie);
        assertNotNull(result);
        assertEquals("Beispieltitel", result.getTitle());
    }

    @Test
    void testGetAllMovies() {
        Movie movie1 = new Movie("Film1", "Beschreibung1", "Pfad1", "2023-01-01", 100, 7.0);
        Movie movie2 = new Movie("Film2", "Beschreibung2", "Pfad2", "2023-02-01", 110, 6.5);
        when(movieRepository.findAll()).thenReturn(Arrays.asList(movie1, movie2));

        List<Movie> movies = movieService.getAllMovies();
        assertEquals(2, movies.size());
    }

    @Test
    void testGetMovieById_Found() {
        Movie movie = new Movie("Film1", "Beschreibung1", "Pfad1", "2023-01-01", 100, 7.0);
        when(movieRepository.findById(1L)).thenReturn(Optional.of(movie));

        Optional<Movie> result = movieService.getMovieById(1L);
        assertTrue(result.isPresent());
        assertEquals("Film1", result.get().getTitle());
    }

    @Test
    void testGetMovieById_NotFound() {
        when(movieRepository.findById(2L)).thenReturn(Optional.empty());

        Optional<Movie> result = movieService.getMovieById(2L);
        assertFalse(result.isPresent());
    }

    @Test
    void testDeleteMovie() {
        doNothing().when(movieRepository).deleteById(1L);

        movieService.deleteMovie(1L);
        verify(movieRepository, times(1)).deleteById(1L);
    }
}
