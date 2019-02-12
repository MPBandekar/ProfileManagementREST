package com.rest.profilemanagement.user;

import com.rest.profilemanagement.user.resources.User;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("authentication/v1/user")
public class UserController {

    //TODO: need to add role check for admin only
    @GetMapping
    public List<User> list(){
        List<User> users = new ArrayList<>();
        return users;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public void create(@RequestBody User user){
    }

    //TODO: Research more on session and security
    @GetMapping("/{id}")
    public User get(@PathVariable Integer id){
        return new User();
    }

}
