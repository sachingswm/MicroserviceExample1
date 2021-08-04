package com.example.user_service.entities;

import lombok.*;

import javax.persistence.*;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
@Entity
public class MovieRating {
    @Id
    @GeneratedValue
    private Long movieRatingId;
    private int rating;
    @ManyToOne(cascade = CascadeType.ALL)
    private Movie movie;
    @ManyToOne(cascade = CascadeType.ALL)
    private User user;
}
