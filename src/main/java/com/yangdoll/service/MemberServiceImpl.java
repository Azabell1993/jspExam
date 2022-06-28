package com.yangdoll.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yangdoll.domain.Member;
import com.yangdoll.persistence.MemberRepository;

@Service
public class MemberServiceImpl implements MemberService {

	@Autowired
	MemberRepository memberRepository; 
	
	@Override
	public Member getMember(String id) {
		
		return memberRepository.findById(id).get();
	}

}
