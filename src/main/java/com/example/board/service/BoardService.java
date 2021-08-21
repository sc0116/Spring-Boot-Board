package com.example.board.service;

import com.example.board.dto.BoardDTO;
import com.example.board.entity.Board;
import com.example.board.entity.Member;
import org.springframework.stereotype.Service;

public interface BoardService {

    Long register(BoardDTO dto);

    default Board dtoToEntity(BoardDTO dto) {

        Member member = Member.builder().email(dto.getWriterEmail()).build();

        Board entity = Board.builder()
                .bno(dto.getBno())
                .title(dto.getTitle())
                .content(dto.getContent())
                .writer(member)
                .build();

        return entity;
    }
}
