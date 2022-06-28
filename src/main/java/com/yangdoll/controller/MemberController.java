package com.yangdoll.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import com.yangdoll.domain.Member;
import com.yangdoll.service.MemberService;

@SessionAttributes("member") // session 영역에 속성을 넣어라.
@Controller
public class MemberController {
	
	@Autowired
	MemberService memberService;
	
	@GetMapping("/login")
	public void login() {}
	
	@GetMapping("/loginCh")
	public String longin(Member member, Model model/*, HttpSession session*/ ) {
		Member findMember = memberService.getMember(member.getId());
		//System.out.println(findMember+"============================================");
		if( findMember != null
				&& findMember.getPassword().equals(member.getPassword())) {
				model.addAttribute("member", findMember);
				/*session.setAttribute("member", findMember);*/
				return "redirect:boardList";
		} else {
			return "redirect:login";
		}
	}
	
	@GetMapping("logOut")
	public String logOut(SessionStatus status) {
		status.setComplete();
		return "redirect:/";
	}
}
