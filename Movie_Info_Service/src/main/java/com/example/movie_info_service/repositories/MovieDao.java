package com.example.movie_info_service.repositories;

import com.example.movie_info_service.entities.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieDao extends JpaRepository<Movie,Long> {
}
