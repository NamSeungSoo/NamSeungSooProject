package model.dto;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class UserDTO {

    private String id;
    private String password;
    private String name;
    private String phoneNo;
    private String gender;

}