package spring.primiPassi.controller3;

import jakarta.websocket.server.PathParam;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerString {

    @GetMapping("/string")
    public String stringController(@RequestParam(value = "x") String x,
                                   @PathParam(value = "y") String y){
        if(y == null){ return x;
        }else return x + " " + y;
    }
}