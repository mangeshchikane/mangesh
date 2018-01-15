package com.example.springdemoservicess;


import com.example.springdemoservicess.User;
import org.springframework.data.repository.CrudRepository;

import java.util.List;


public interface UserRepository extends CrudRepository<User, Long>{
    List<User> findByName(String lastName);
}