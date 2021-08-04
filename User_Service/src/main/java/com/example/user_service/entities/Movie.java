package com.example.user_service.entities;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
@Entity
public class Movie {
    @Id
    @GeneratedValue
    private long movieId;
    private String movieName;
}
