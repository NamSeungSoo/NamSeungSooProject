package model.dto;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class UserDTO {

    private String email;
    private String pwd;
    private String name;
    private String phone;
    private String gender;

}