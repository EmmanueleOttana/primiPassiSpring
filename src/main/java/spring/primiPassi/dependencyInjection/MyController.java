package spring.primiPassi.dependencyInjection;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/injection")
public class MyController {

    private MyService myService;

    public MyController(MyService myService) {
        this.myService = myService;
        System.out.println("MyController constructor has been called");
    }

    @GetMapping("/getname")
    public String getName(){
        return "myService.getName() method was called\n"
                + myService.getName();
    }
    @GetMapping("/")
    public String welcome(){
        return "myService.welcome() method has been called \n"
                + "Benvenuto!";
    }

}