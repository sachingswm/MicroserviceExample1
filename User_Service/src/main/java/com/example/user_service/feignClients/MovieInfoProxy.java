package com.example.user_service.feignClients;

import com.example.user_service.entities.Movie;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name="MOVIE-INFO-SERVICE",url="localhost:9000")
public interface MovieInfoProxy
{
    @GetMapping("/movie/{movieId}")
    public Movie getMovie(@PathVariable Long movieId);
}
