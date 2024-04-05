package com.von.kubernetesuser.user.model;

import org.springframework.stereotype.Component;
import lombok.*;

@Component
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserDTO {

    private Long id;
    private String username;
    private String password;
    private String name;
    private String phone;
    private Long addressId;
    private String job;


}