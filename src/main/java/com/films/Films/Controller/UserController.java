package com.films.Films.Controller;


import com.films.Films.Entity.Users;
import com.films.Films.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.List;

@RestController()
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping(path = "/users")
public class UserController {

    private final UserService userService;

    public UserController (@Autowired UserService userService){
        this.userService = userService;
    }


    @GetMapping("/all") //Method GET
    public List<Users> getAllUsers() {
        System.out.println("["+ LocalDateTime.now() + "]: Lista de usuarios ");
        return userService.getUsers();
    }

    @GetMapping("count")
    public Integer geCountUsers(){
        System.out.println("["+ LocalDateTime.now() + "]: Count of users ");
        return userService.getCountUsers();
    }


}
