package com.yangdoll.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {

	@GetMapping("/hello")
	public String hello(Model model) {
		model.addAttribute("printData", "영구없으요....!!");
		return "Hello";
	}
}
