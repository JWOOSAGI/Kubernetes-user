package com.von.kubernetesuser.user.service;

import com.von.kubernetesuser.common.service.CommandService;
import com.von.kubernetesuser.common.service.QueryService;
import com.von.kubernetesuser.user.model.User;
import com.von.kubernetesuser.user.model.UserDTO;

import java.util.List;
import java.util.Optional;

public interface UserService extends CommandService<UserDTO>, QueryService<UserDTO> {
    String changePassword(User user);
    List<?> findUsersByName(String name);
    List<?> findUsersByJob(String job);

    default User dtoToEntity(UserDTO dto){
        return User.builder()
                .username(dto.getUsername())
                .password(dto.getPassword())
                .name(dto.getName())
                .phone(dto.getPhone())
                .job(dto.getJob())
                .build();
    }

    default UserDTO entityToDTO(Optional<User> optional){
        return UserDTO.builder().build();
    }

}
