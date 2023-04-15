package spring.primiPassi.controller5;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import lombok.ToString;


@Data
@ToString
public class CarDTO {

    @NotBlank
    private String id = "xyz-165";
    @NotBlank
    private String modelName = "BMW";

    private double price = 54999.99;

}