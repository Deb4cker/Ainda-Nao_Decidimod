package com.pmnato.fortus.controller;

import com.pmnato.fortus.entity.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("/user/all")
    public User[] getAll() {
        return new User[]{
                new User(1L, "John", "john@email.com", "", ""),
                new User(2L, "Mary", "mary@email.com", "", ""),
                new User(3L, "Paul", "paul@email.com", "", ""),
                new User(4L, "Jesy", "jesy@email.com", "", ""),
                new User(5L, "Kali", "kali@email.com", "", ""),
                new User(6L, "Beny", "beny@email.com", "", ""),
                new User(7L, "Bill", "bill@email.com", "", ""),
                new User(8L, "Alle", "alle@email.com", "", ""),
                new User(9L, "Vlad", "vlad@email.com", "", "")
        };
    }

    @GetMapping("/")
    public String home(){
        return """
                <!DOCTYPE html>
                <html lang="en">
                <head>
                    <meta charset="UTF-8">
                    <meta name="viewport" content="width=device-width, initial-scale=1.0">
                    <title>Nada pequenino, naada 🏊‍♂️</title>
                </head>
                <style>
                    button {
                        color: #090909;
                        padding: 0.7em 1.7em;
                        font-size: 18px;
                        border-radius: 0.5em;
                        background: #e8e8e8;
                        cursor: pointer;
                        border: 1px solid #e8e8e8;
                        transition: all 0.3s;
                        box-shadow: 6px 6px 12px #c5c5c5, -6px -6px 12px #ffffff;
                    }
                            
                    button:active {
                        color: #666;
                        box-shadow: inset 4px 4px 12px #c5c5c5, inset -4px -4px 12px #ffffff;
                    }
                            
                </style>
                <body>
                    <h1>Ta funcionando!!</h1>
                            
                    <a href="https://youtu.be/z5d80AZ-KQ4?si=JZ5o4xgrWGYjHuK-" target="_blank" style="text-decoration: none;">
                        <button>Caminhão do diabo 🚚👺</button>
                    </a>
                </body>
                </html>
                """;
    }

}
