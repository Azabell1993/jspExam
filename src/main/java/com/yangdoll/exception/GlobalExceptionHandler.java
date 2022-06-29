package com.yangdoll.exception;

import java.sql.SQLException;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {
	@ExceptionHandler(BoardException.class)
	public String handleCustomException(BoardException exc, Model model) {
		model.addAttribute("exception", exc);
		return "/error/boardError";
	}
	
	@ExceptionHandler(Exception.class)
	public String handleException(Exception exc, Model model) {
		model.addAttribute("exception", exc);
		return "/error/globalError";
	}
	
	@ExceptionHandler(SQLException.class)
	public String handleSQLException(Exception exc, Model model) {
		model.addAttribute("exception", exc);
		return "/error/sqlError";
	}
}
