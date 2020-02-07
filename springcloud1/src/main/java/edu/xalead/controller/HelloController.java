package edu.xalead.controller;

import edu.xalead.entity.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("findUser")
    public User findUser(){
        User u = new User();
        u.setId(10124);
        u.setUsername("drr");
        u.setPassword("236325");
        return u;
    }
}
