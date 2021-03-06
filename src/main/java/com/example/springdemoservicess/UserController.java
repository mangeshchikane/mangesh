package com.example.springdemoservicess;

//import com.example.springdemoservicess.User;
//import com.example.springdemoservicess.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
//import  java.util.stream;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserRepository userRepository;

    @RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void create(@RequestBody User user) {
        userRepository.save(user);

    }

    @RequestMapping(value = "/{id}")
    public User read(@PathVariable Long id)
    {
        return userRepository.findOne(id);
    }

    @RequestMapping(method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void update(@RequestBody User user) {
        userRepository.save(user);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable long id) {
        userRepository.delete(id);
    }

}
