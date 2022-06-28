package com.yangdoll.service;

import java.util.List;

import com.yangdoll.domain.Board;

public interface BoardService {

	List<Board> boardList();

	Board getBoard(Long seq);

	void deleteBoard(Long seq);

	void updateBoard(Board board);

	void insertBoard(Board board);



}
