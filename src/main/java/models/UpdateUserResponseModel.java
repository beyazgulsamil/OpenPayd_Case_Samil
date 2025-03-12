package models;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class UpdateUserResponseModel {

    String name;
    String job;
    String updatedAt;

}
