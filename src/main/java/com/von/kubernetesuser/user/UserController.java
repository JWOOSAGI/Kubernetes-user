package com.von.kubernetesuser.user;

import com.von.kubernetesuser.common.component.MessengerVO;
import com.von.kubernetesuser.user.model.UserDTO;

import com.von.kubernetesuser.user.service.UserServiceImpl;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import org.springdoc.core.converters.models.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;
import java.util.*;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequiredArgsConstructor
@RequestMapping(path = "/api/users")
@Slf4j
public class UserController {
    private final UserServiceImpl service;

    // -------------------- Command ---------------------------
//    @ApiResponses(value = {
//            @ApiResponse(responseCode = "400", description = "Invalid ID supplied"),
//            @ApiResponse(responseCode = "404", description = "Customer not found")})
    @PostMapping(path = "")
    public ResponseEntity<MessengerVO> save(@RequestBody UserDTO UserDTO) {
        log.info("입력받은 정보 : {}", UserDTO );
        // User newUser = service.save(param);
        service.save(UserDTO);
        return ResponseEntity.ok(new MessengerVO("성공",200,"success"));
    }

    // -------------------- Query ---------------------------
    @ApiResponses(value = {
            @ApiResponse(responseCode = "400", description = "Invalid ID supplied"),
            @ApiResponse(responseCode = "404", description = "Customer not found")})
    @PostMapping(path="/login")
    public Map<String,?> name(@RequestBody Map<?,?> paramMap){
        Map<String, MessengerVO> map = new HashMap<>();

        String userName = (String) paramMap.get("userName");

        //User dbuser = service.findByUsername(userName).orElse(null);//Entity, Optinal, List 3가지 타입만 가능

        return map;
    }

//    @ApiResponses(value = {
//            @ApiResponse(responseCode = "400", description = "Invalid ID supplied"),
//            @ApiResponse(responseCode = "404", description = "Customer not found")})
    @GetMapping("/all-users")
    public ResponseEntity<List<UserDTO>>findAll(Pageable pageable) {
        return ResponseEntity.ok(new ArrayList<>());
    }

    @ApiResponses(value = {
            @ApiResponse(responseCode = "400", description = "Invalid ID supplied"),
            @ApiResponse(responseCode = "404", description = "Customer not found")})
    @GetMapping("/{id}")
    public ResponseEntity<Optional<UserDTO>> findUserById(@PathVariable Long id) {
        Map<String, String> response = new HashMap<>();
        return ResponseEntity.ok(Optional.of(new UserDTO()));
    }

    @ApiResponses(value = {
            @ApiResponse(responseCode = "400", description = "Invalid ID supplied"),
            @ApiResponse(responseCode = "404", description = "Customer not found")})
    @GetMapping("/password")
    public Map<String,?> changePassword(@RequestBody Map<String,?> map) {
        return null;
    }

    @DeleteMapping("/api/all-users")
    public ResponseEntity<MessengerVO> deleteUser(@RequestBody Map<?, ?> paramap) {
        return ResponseEntity.ok(new MessengerVO());
    }


//    @GetMapping("/api/all-users")
//    public ResponseEntity<MessengerVO> getUserList() {
//        return ResponseEntity.ok(new MessengerVO());
//    }
//
//
//    @GetMapping("/api/all-users")
//    public ResponseEntity<MessengerVO> findUserByName(@RequestBody Map<?, ?> paramap) {
//        return ResponseEntity.ok(new MessengerVO());
//
//    }
//
//
//    @GetMapping("/api/all-users")
//    public ResponseEntity<MessengerVO> findUserByJob(@RequestBody Map<?, ?> paramap) {
//        return ResponseEntity.ok(new MessengerVO());
//    }
//
//
//    @GetMapping("/api/all-users")
//    public ResponseEntity<MessengerVO> countUser() {
//        return ResponseEntity.ok(new MessengerVO());
//
//    }
//
//    @GetMapping("/api/all-users")
//    public ResponseEntity<MessengerVO> getOne(@RequestBody Map<?, ?> paramap) throws SQLException {
//        return ResponseEntity.ok(new MessengerVO());
//    }
//
//
//    @GetMapping("/api/all-users")
//    public ResponseEntity<MessengerVO> findUsers() throws SQLException {
//
//        return ResponseEntity.ok(new MessengerVO());
//    }
//
//
//    @GetMapping("/api/all-users")
//    public ResponseEntity<MessengerVO> getUser(@RequestBody Map<?, ?> paramap) throws SQLException {
//        return ResponseEntity.ok(new MessengerVO());
//    }
//
//
//    @GetMapping("/api/all-users")
//    public ResponseEntity<MessengerVO> touchTable() throws SQLException {
//        return ResponseEntity.ok(new MessengerVO());
//    }
//
//
//    @GetMapping("/api/all-users")
//    public ResponseEntity<MessengerVO> removeTable() throws SQLException {
//        return ResponseEntity.ok(new MessengerVO());
//    }

}
