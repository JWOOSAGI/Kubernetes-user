package com.von.kubernetesuser.article;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ArticleServiceImpl implements ArticleService {

    private final ArticleRepository repository;

    @Override
    public String save(Article article) {
        return null;
    }

    @Override
    public String insertMany() {
        return null;
    }

    @Override
    public String delete(Article article) {
        return null;
    }

    @Override
    public List<Article> findAll() throws SQLException {
        return null;
    }

    @Override
    public Optional<ArticleDTO> findById(Long id) {
        Article ent = repository.findById(id).get();

        Optional<ArticleDTO> dto = entityToDto(ent);

        return Optional.of(dto.orElse(null));

    }

    @Override
    public String count() {
        return null;
    }

    @Override
    public Optional<Article> getOne(String id) {
        return Optional.empty();
    }

    @Override
    public Boolean existsById(Long id) {
        return null;
    }
}