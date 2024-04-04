package com.von.kubernetesuser.user;

import com.von.kubernetesuser.common.component.MessengerVO;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequiredArgsConstructor
public class UserController {
    private final UserRepository repository;

    @GetMapping("/api/join")
    public String hello(){
        return "welcom";
    }

    @PostMapping(path="/api/login")
    public Map<String,?> name(@RequestBody Map<?,?> paramMap){
        Map<String, MessengerVO> map = new HashMap<>();

        String userName = (String) paramMap.get("userName");

        User dbuser = repository.findByUsername(userName).orElse(null);//Entity, Optinal, List 3가지 타입만 가능

        return map;
    }
    @PostMapping(path="/api/users")
    public Map<String,?> username (@RequestBody Map<String,?> paramMap){

        User newUser = repository.save(User.builder()
                .username((String) paramMap.get("username"))
                .password((String) paramMap.get("psw"))
                .name((String) paramMap.get("name"))
                .phone((String) paramMap.get("phone"))
                .job((String) paramMap.get("job"))
                .build());

        System.out.println("DB에 저장된 User 정보 : "+newUser);
        Map<String, MessengerVO> map = new HashMap<>();

        return map;
    }

    @GetMapping("/api/all-users")
    public List<User> findAll() throws SQLException{
        return repository.findAll();
    }

    public Map<String,?> save(@RequestBody Map<String,?> map) {
        return null;
    }

    public Map<String,?> login(@RequestBody Map<String,?> map) {
        return null;
    }

    public Map<String,?> changePassword(@RequestBody Map<String,?> map) {
        return null;
    }

    public Map<String,?> delete(@RequestBody Map<String,?> map) {
        return null;
    }

    public Map<String,?> findUsersByName(@RequestBody Map<String,?> map) {
        return null;
    }

    public Map<String,?> findUsersByJob(@RequestBody Map<String,?> map) {
        return null;
    }


    public Map<String,?> count() {
        return null;
    }

    public Map<String,?> findUsers() throws SQLException {
        return null;
    }

    public void createTable() throws SQLException {
    }

    public void deleteTable() throws SQLException {
    }


    public Map<String,?> getOne(@RequestBody Map<String,?> map) {
        return null;
    }

    public Map<String,?> findUser(@RequestBody Map<String,?> map) {
        return null;
    }
}
