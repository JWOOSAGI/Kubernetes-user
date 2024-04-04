package com.von.kubernetesuser.user;

import com.von.kubernetesuser.common.command.CommandService;
import com.von.kubernetesuser.common.query.QueryService;

import java.util.List;

public interface UserService extends CommandService, QueryService {

    // command
    String changePassword(User user);

    // query
    List<?> findUsersByName(String name);
    List<?> findUsersByJob(String job);

}
