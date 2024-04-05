package com.von.kubernetesuser.board.serivce;

import com.von.kubernetesuser.article.model.Article;
import com.von.kubernetesuser.article.model.ArticleDTO;
import com.von.kubernetesuser.board.model.Board;
import com.von.kubernetesuser.board.model.BoardDTO;
import com.von.kubernetesuser.common.service.CommandService;
import com.von.kubernetesuser.common.service.QueryService;

import java.util.*;

public interface BoardService extends  CommandService<BoardDTO>, QueryService<BoardDTO> {

    default Board dtoToEntity(BoardDTO dto){
        return Board.builder().build();
    }

    default BoardDTO entityToDTO(Optional<Board> optional){
        return BoardDTO.builder().build();
    }

}
