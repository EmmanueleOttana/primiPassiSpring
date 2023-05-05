package spring.primiPassi.controller5;

import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class CarController {

    @GetMapping("/car")
    public CarDTO getCar(){
        return new CarDTO();
    }

    @PostMapping("/car")
    public String car(@Valid @RequestBody CarDTO car){
        return "The car {" + car.toString() +"} is created!";
    }

}