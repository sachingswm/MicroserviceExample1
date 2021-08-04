package com.example.user_service.controller;

import com.example.user_service.dto.ResponseUser;
import com.example.user_service.entities.Movie;
import com.example.user_service.entities.MovieRating;
import com.example.user_service.entities.User;
import com.example.user_service.feignClients.MovieInfoProxy;
import com.example.user_service.feignClients.MovieRatingProxy;
import com.example.user_service.services.UserService;
import org.hibernate.cfg.Environment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @Autowired
    private MovieInfoProxy movieInfoProxy;

    @Autowired
    private MovieRatingProxy movieRatingProxy;

    @GetMapping("/{userId}")
    public ResponseUser getUser(@PathVariable Long userId)
    {
        User user=userService.findById(userId);
        List<MovieRating> allMovieRating = movieRatingProxy.getAllMovieRating(userId);
        Map<String,Integer> ratings=new HashMap<>();
        for(MovieRating movieRating:allMovieRating)
        {
            Movie movie=movieInfoProxy.getMovie(movieRating.getMovie().getMovieId());
            ratings.put(movie.getMovieName(),movieRating.getRating());
        }
        ResponseUser responseUser=new ResponseUser();
        responseUser.setUser(user);
        responseUser.setRating(ratings);
        return responseUser;
    }
}
