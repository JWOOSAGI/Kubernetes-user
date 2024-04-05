package com.von.kubernetesuser.article.service;


import com.von.kubernetesuser.article.model.Article;
import com.von.kubernetesuser.article.model.ArticleDTO;
import com.von.kubernetesuser.article.repository.ArticleRepository;
import com.von.kubernetesuser.article.service.ArticleService;
import com.von.kubernetesuser.common.component.PageRequestVO;
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
    public ArticleDTO save(ArticleDTO t) {
        return entityToDTO(Optional.of(repository.save(dtoToEntity(t))));
    }

    @Override
    public void deleteById(Long id) {
         repository.deleteById(id);
    }

    @Override
    public List<ArticleDTO> findAll(PageRequestVO vo) {
        //return repository.findAll(vo);
        return null;
    }


    @Override
    public Optional<ArticleDTO> findById(Long id) {
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
}