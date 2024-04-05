package com.von.kubernetesuser.board.serivce;

import com.von.kubernetesuser.board.model.BoardDTO;
import com.von.kubernetesuser.board.repository.BoardRepository;
import com.von.kubernetesuser.board.serivce.BoardService;
import com.von.kubernetesuser.common.component.PageRequestVO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.List;
import java.util.Optional;


@Service
@RequiredArgsConstructor
public class BoardServiceImpl implements BoardService {

    private final BoardRepository repository;


    @Override
    public BoardDTO save(BoardDTO t) {
        return entityToDTO(Optional.of(repository.save(dtoToEntity(t))));
    }

    @Override
    public void deleteById(Long id) {
        repository.deleteById(id);
    }

    @Override
    public List<BoardDTO> findAll(PageRequestVO vo) {
        //return repository.findAll(vo);
        return null;
    }

    @Override
    public Optional<BoardDTO> findById(Long id) {
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
