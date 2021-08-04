package com.example.movie_info_service.services;

import com.example.movie_info_service.entities.Movie;
import com.example.movie_info_service.repositories.MovieDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovieService {
    @Autowired
    private MovieDao movieDao;

    public Movie getMovie(Long movieId) {
        return movieDao.findById(movieId).get();
    }
}
