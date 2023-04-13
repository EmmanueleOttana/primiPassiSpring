package spring.primiPassi.controller2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/fattoriale")
public class FactorialController {

    @GetMapping("/{n}")
    public int factorialController(@PathVariable int n){
        int result = n;
        for (int i = n-1; i > 0; i--) {
            result = result * i;
        }
        return result;
    }
}
