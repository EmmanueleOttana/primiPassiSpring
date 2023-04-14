package spring.primiPassi.controller4;

import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerHeader {

    @GetMapping("/header")
    public String headerController(@RequestHeader HttpHeaders headers){
        return String.valueOf(headers.get("host"));
    }
}
