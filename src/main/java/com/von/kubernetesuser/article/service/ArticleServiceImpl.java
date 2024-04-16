package com.von.kubernetesuser.article.service;


import com.von.kubernetesuser.article.model.Article;
import com.von.kubernetesuser.article.model.ArticleDTO;
import com.von.kubernetesuser.article.repository.ArticleRepository;
import com.von.kubernetesuser.article.service.ArticleService;
import com.von.kubernetesuser.common.component.MessengerVO;
import com.von.kubernetesuser.common.component.PageRequestVO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ArticleServiceImpl implements ArticleService {
    private final ArticleRepository repo;

    @Override
    public MessengerVO save(ArticleDTO articleDTO) {
        return null;
    }

    @Override
    public MessengerVO deleteById(Long id) {
        repo.deleteById(id);
        return new MessengerVO();
    }

    @Override
    public MessengerVO modify(ArticleDTO articleDTO) {
        return null;
    }

    @Override
    public List<ArticleDTO> findAll() {
        return repo.findAll().stream().map(i->entityToDTO(i)).toList();
    }

    @Override
    public Optional<ArticleDTO> findById(Long id) {
        return repo.findById(id).map(this::entityToDTO);
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public boolean existsById(Long id) {
        return false;
    }
}