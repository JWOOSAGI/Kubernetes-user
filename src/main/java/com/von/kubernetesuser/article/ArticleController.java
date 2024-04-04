package com.von.kubernetesuser.article;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequiredArgsConstructor
public class ArticleController {
    private final ArticleServiceImpl service;


    @SuppressWarnings("unchecked")
    @GetMapping("/api/all-articles")
    public Map<?,?> findAll() throws SQLException {
        Map<String, Object> map = new HashMap<>();

        return map;
    }
}