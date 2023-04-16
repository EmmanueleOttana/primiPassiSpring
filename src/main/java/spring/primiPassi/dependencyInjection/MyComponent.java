package spring.primiPassi.dependencyInjection;

import org.springframework.stereotype.Component;

@Component
public class MyComponent {

    private String myComponentName;

    public MyComponent() {
        this.myComponentName = "Emmanuele";
        System.out.println("MyComponent constructor has been called");
    }

    public String getMyComponentName() {
        return "MyComponent.getMyComponentName() method has been called\n"+ myComponentName;
    }
}
