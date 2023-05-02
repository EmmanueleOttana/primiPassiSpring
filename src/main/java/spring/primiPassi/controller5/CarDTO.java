package spring.primiPassi.controller5;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import lombok.ToString;


@Data
@ToString
public class CarDTO {

    @NotBlank
    private String id;
    @NotBlank
    private String modelName;

    private double price;

}