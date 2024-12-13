package org.example.ibramovie.controller;

import org.example.ibramovie.model.Movie;
import org.example.ibramovie.Service.MovieService;
import org.example.ibramovie.Service.WatchlistService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class MovieControllerTest {

    @Mock
    private MovieService movieService;

    @Mock
    private WatchlistService watchlistService;

    @InjectMocks
    private MovieController movieController;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testAddMovie() {
        Movie movie = new Movie("Film1", "Beschreibung", "Pfad", "2023-01-01", 120, 7.0);
        when(movieService.addMovie(movie)).thenReturn(movie);

        ResponseEntity<Movie> response = movieController.addMovie(movie);
        assertEquals(HttpStatus.OK, response.getStatusCode());
        assertEquals("Film1", response.getBody().getTitle());
    }

    @Test
    void testGetMovieById_Found() {
        Movie movie = new Movie("Film1", "Beschreibung", "Pfad", "2023-01-01", 120, 7.0);
        when(movieService.getMovieById(1L)).thenReturn(Optional.of(movie));

        ResponseEntity<Movie> response = movieController.getMovieById(1L);
        assertEquals(HttpStatus.OK, response.getStatusCode());
        assertEquals("Film1", response.getBody().getTitle());
    }

    @Test
    void testGetMovieById_NotFound() {
        when(movieService.getMovieById(2L)).thenReturn(Optional.empty());

        ResponseEntity<Movie> response = movieController.getMovieById(2L);
        assertEquals(HttpStatus.NOT_FOUND, response.getStatusCode());
    }

    @Test
    void testDeleteMovie() {
        doNothing().when(movieService).deleteMovie(1L);

        ResponseEntity<Void> response = movieController.deleteMovie(1L);
        assertEquals(HttpStatus.NO_CONTENT, response.getStatusCode());
    }

    @Test
    void testGetAllMovies() {
        Movie movie1 = new Movie("Film1", "Beschreibung1", "Pfad1", "2023-01-01", 100, 7.0);
        Movie movie2 = new Movie("Film2", "Beschreibung2", "Pfad2", "2023-02-01", 110, 6.5);
        when(movieService.getAllMovies()).thenReturn(Arrays.asList(movie1, movie2));

        ResponseEntity<List<Movie>> response = movieController.getAllMovies();
        assertEquals(HttpStatus.OK, response.getStatusCode());
        assertEquals(2, response.getBody().size());
    }

    @Captor
    private ArgumentCaptor<Movie> movieCaptor;

    @Test
    void testCaptorUsage() {
        Movie movie = new Movie("CapturedFilm", "Description", "Path", "2023-01-01", 120, 8.0);
        movieController.addMovie(movie);
        verify(movieService).addMovie(movieCaptor.capture());
        assertEquals("CapturedFilm", movieCaptor.getValue().getTitle());
    }
}
