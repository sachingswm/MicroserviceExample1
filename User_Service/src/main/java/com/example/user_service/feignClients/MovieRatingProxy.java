package com.example.user_service.feignClients;

import com.example.user_service.entities.MovieRating;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name="MOVIE-RATING-SERVICE",url="localhost:7000")
public interface MovieRatingProxy
{
    @GetMapping("/movieRating/{userId}")
    public List<MovieRating> getAllMovieRating(@PathVariable Long userId);

}