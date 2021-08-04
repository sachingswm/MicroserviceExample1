package com.example.user_service.repositories;

import com.example.user_service.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserDao extends JpaRepository<User,Long> {
    @Query(value = "select user_movie.movie_id from user_movie where user_movie.user_id=?",nativeQuery = true)
    public List<Long> findAllById(Long userId);
}
