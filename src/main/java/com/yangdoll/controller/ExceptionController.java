package com.yangdoll.controller;

import java.sql.SQLException;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.yangdoll.exception.BoardNotFoundException;

@Controller
public class ExceptionController {
	
	@RequestMapping("/boardError")
	public String boardError() {
		throw new BoardNotFoundException("검색된 게시글이 없습니다...프라이머키를 확인하세요.");
		
	}
	
	@RequestMapping("illegalError")
	public String illegalError() {
		throw new IllegalArgumentException("부적절한 인자가 전달 되었음...인자 확인 요망");
	}
	
	@RequestMapping("sqlError")
	public String sqlError() throws SQLException {
		throw new SQLException("Sql 쿼리 구문에 문제가 있습니다.");
	}
}
