package com.pmnato.fortus.controller;

import com.pmnato.fortus.entity.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("/user/all")
    public User[] getAll() {
        return new User[]{
                new User(1l, "John", "john@email.com", "", ""),
                new User(2l, "Mary", "mary@email.com", "", ""),
                new User(3l, "Paul", "paul@email.com", "", ""),
                new User(4l, "Jesy", "jesy@email.com", "", ""),
                new User(5l, "Kali", "kali@email.com", "", ""),
                new User(6l, "Beny", "beny@email.com", "", ""),
                new User(7l, "Bill", "bill@email.com", "", ""),
                new User(8l, "Alle", "alle@email.com", "", ""),
                new User(9l, "Vlad", "vlad@email.com", "", "")
        };
    }

    @GetMapping("/")
    public String home(){
        return "Ta funcionando";
    }
}
