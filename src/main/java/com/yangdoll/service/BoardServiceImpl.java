package com.yangdoll.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yangdoll.domain.Board;
import com.yangdoll.persistence.BoardRepository;

@Service
public class BoardServiceImpl implements BoardService{
	
	@Autowired
	private BoardRepository boardRepository;

	@Override
	public List<Board> boardList() {
		return (List<Board>) boardRepository.findAll();
	}

	@Override
	public Board getBoard(Long seq) {
		
		return boardRepository.findById(seq).get();
	}

	@Override
	public void deleteBoard(Long seq) {
		boardRepository.deleteById(seq);
	}

	@Override
	public void updateBoard(Board board) {
		Board rtnBoard =boardRepository.findById(board.getSeq()).get();
		rtnBoard.setContent(board.getContent());
		rtnBoard.setTitle(board.getTitle());
		boardRepository.save(rtnBoard);
	}

	@Override
	public void insertBoard(Board board) {
		boardRepository.save(board);
	}

}
