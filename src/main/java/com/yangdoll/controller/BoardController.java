package com.yangdoll.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.yangdoll.domain.Board;
import com.yangdoll.service.BoardService;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor //필수 생성자를 만들고 자동 주입까지 해주는 기능을 가지고 있다.
public class BoardController {
	
//	@Autowired
	private final BoardService service;
	
	@GetMapping("boardList")
	public String boardList(Model model) {
		List<Board> list = service.boardList();
		model.addAttribute("list", list);
		model.addAttribute("testChar", "이내용이 나올까요?");
		return "/boardList";
	}
	
	@GetMapping("getBoard")
	public void/* String */ getBoard( Long seq, Model model) {
		model.addAttribute("board", service.getBoard(seq));
	//  return "getBoard";
	}
	
	@GetMapping("deleteBoard")
	public String deleteBoard(Long seq) {
		service.deleteBoard(seq);
		return "redirect:boardList";
	}
	
	@GetMapping("/updateBoard")
	public String updateBoard(Board board) {
		service.updateBoard(board);
		return "redirect:boardList";
	}
	
	@GetMapping("insertBoard")
	public void insertBoard() {
	}
	
	@PostMapping("insertBoard")
	public String insertBoard(Board board){
		service.insertBoard(board);
		return "redirect:boardList";
	}
}
