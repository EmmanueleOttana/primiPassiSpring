package spring.primiPassi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    String name = "Emmanuele";
    StringBuilder nameSB = new StringBuilder(name);

    @GetMapping("/name")
    public String nameController(){
        return "Il mio nome è " + name;
    }
    @PostMapping("/name")
    public String nameControllerReverse(){
        return "Il mio nome invertito è "+ nameSB.reverse().toString();
    }
}
