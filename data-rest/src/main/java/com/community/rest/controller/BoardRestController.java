package com.community.rest.controller;

import com.community.rest.repository.BoardRepository;
import org.springframework.data.rest.webmvc.RepositoryRestController;

@RepositoryRestController
public class BoardRestController {

    private BoardRepository boardRepository;

    public BoardRestController(BoardRepository boardRepository) {
        this.boardRepository = boardRepository;
    }
}
