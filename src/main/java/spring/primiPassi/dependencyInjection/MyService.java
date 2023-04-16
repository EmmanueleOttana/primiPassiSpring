package spring.primiPassi.dependencyInjection;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Data
public class MyService {

    private MyComponent myComponent;

    @Autowired
    public MyService(MyComponent myComponent) {
        System.out.println("MyService constructor has been called");
        this.myComponent = myComponent;
    }

    public String getName(){
        return "MyComponent.getName() method was called\n" + myComponent.getMyComponentName();
    }

}