package com.von.kubernetesuser.common;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin("http://localhost:3000")
@RestController
@RequiredArgsConstructor
public class HomeController {

    @GetMapping("/")
    public String hello() {
        return "welcome to Spring boot";
    }

}
