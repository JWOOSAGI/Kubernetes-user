package com.von.kubernetesuser.user.service;

import com.von.kubernetesuser.common.component.PageRequestVO;
import com.von.kubernetesuser.user.model.User;
import com.von.kubernetesuser.user.model.UserDTO;
import com.von.kubernetesuser.user.repository.UserRepository;
import com.von.kubernetesuser.user.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;

import java.util.List;
import java.util.Optional;


@Controller
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository repository;


    @Override
    public UserDTO save(UserDTO t) {
        return entityToDTO(Optional.of(repository.save(dtoToEntity(t))));
    }

    @Override
    public void deleteById(Long id) {
        repository.deleteById(id);
    }

    @Override
    public List<UserDTO> findAll(PageRequestVO vo) {
        //return repository.findAll(vo);
        return null;
    }

    @Override
    public Optional<UserDTO> findById(Long id) {
        return Optional.of(entityToDTO(repository.findById(id)));
    }

    @Override
    public long count() {
        return repository.count();
    }

    @Override
    public boolean existsById(Long id) {
        return repository.existsById(id);
    }

    @Override
    public String changePassword(User user) {
        return null;
    }

    @Override
    public List<?> findUsersByName(String name) {
        return null;
    }

    @Override
    public List<?> findUsersByJob(String job) {
        return null;
    }
}