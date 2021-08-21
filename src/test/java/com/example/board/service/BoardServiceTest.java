package com.example.board.service;

import com.example.board.dto.BoardDTO;
import com.example.board.repository.BoardRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class BoardServiceTest {

    @Autowired
    private BoardService boardService;

    @Test
    public void testRegister() {

        BoardDTO dto = BoardDTO.builder()
                .title("TEST Title")
                .content("TEST Content")
                .writerEmail("user55@test.com")
                .build();

        Long bno = boardService.register(dto);
    }
}