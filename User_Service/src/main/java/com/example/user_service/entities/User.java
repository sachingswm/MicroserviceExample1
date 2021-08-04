package com.example.user_service.entities;

import lombok.*;
import javax.persistence.*;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Entity
public class User{
    @Id
    @GeneratedValue
    private Long userId;
    private String userName;
}
