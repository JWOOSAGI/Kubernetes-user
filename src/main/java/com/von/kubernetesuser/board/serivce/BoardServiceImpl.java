package com.von.kubernetesuser.board.serivce;

import com.von.kubernetesuser.board.model.BoardDTO;
import com.von.kubernetesuser.board.repository.BoardRepository;
import com.von.kubernetesuser.board.serivce.BoardService;
import com.von.kubernetesuser.common.component.MessengerVO;
import com.von.kubernetesuser.common.component.PageRequestVO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@Service
@RequiredArgsConstructor
public class BoardServiceImpl implements BoardService {
    private final BoardRepository repo;


    @Override
    public MessengerVO save(BoardDTO dto) {
        //dto를 받아서 dto를 반환 근데 repository는 entity밖에 모름
        repo.save(dtoToEntity(dto));
        return new MessengerVO();
    }

    @Override
    public MessengerVO deleteById(Long id) {
        return new MessengerVO();
    }

    @Override
    public MessengerVO modify(BoardDTO boardDTO) {
        throw new UnsupportedOperationException("Unimplemented method 'updatePassword'");
    }


    @Override
    public List<BoardDTO> findAll() {
        return repo.findAll().stream().map(i->entityToDto(i)).toList();
    }

    @Override
    public Optional<BoardDTO> findById(Long id) {
        return repo.findById(id).map(this::entityToDto);
    }

    @Override
    public long count() {
        return repo.count();
    }

    @Override
    public boolean existsById(Long id) {
        return false;
    }

}
