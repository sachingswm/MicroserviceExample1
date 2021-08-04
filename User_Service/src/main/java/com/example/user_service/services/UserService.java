package com.example.user_service.services;

import com.example.user_service.entities.User;
import com.example.user_service.repositories.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserDao userDao;

    public List<Long> findAllById(Long userId)
    {
        return userDao.findAllById(userId);
    }

    public User findById(Long userId) {
        return userDao.findById(userId).get();
    }
}
