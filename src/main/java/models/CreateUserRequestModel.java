package models;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CreateUserRequestModel {

    String name;
    String job;
}
