package org.example.ibramovie.repository;

import org.example.ibramovie.model.Watchlist;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface WatchlistRepository extends JpaRepository<Watchlist, Long> {

    Optional<Watchlist> findByMovieId(Long movieId);

    void deleteByMovieId(Long movieId);
}
