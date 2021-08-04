package com.example.user_service.dto;

import com.example.user_service.entities.Movie;
import com.example.user_service.entities.MovieRating;
import com.example.user_service.entities.User;
import lombok.*;
import java.util.Map;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
public class ResponseUser {
    private User user;
    private Map<String,Integer> rating;
}
